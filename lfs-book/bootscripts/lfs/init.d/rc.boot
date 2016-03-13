#!/bin/sh

# mounting virtual file systems
# (make sure /run/var is available before logging any messages)
mount -t tmpfs tmpfs /run
mkdir -p /run/var /run/lock /run/shm
chmod 1777 /run/shm /run/lock
mount -t proc proc /proc
mount -t sysfs sysfs /sys
mkdir -m 0755 /dev/pts
mount -t devpts -o gid=5,mode=620 devpts /dev/pts
ln -sfn /run/shm /dev/shm


# Populating /dev with device nodes

# Avoid race conditions, serialize hotplug events.
touch /dev/mdev.seq

# Some basic nodes.
[ ! -e /dev/console ] && mknod /dev/console c 5 1
[ ! -e /dev/null ]    && mknod /dev/null c 1 3
[ ! -e /dev/tty ]     && mknod /dev/tty c 5 0
[ ! -e /dev/tty1 ]    && mknod /dev/tty1 c 4 1
[ ! -e /dev/urandom ] && mknod /dev/urandom c 1 9
[ ! -e /dev/random ]  && mknod /dev/random c 1 8
[ ! -e /dev/zero ]    && mknod /dev/zero c 1 5

ln -snf /proc/self/fd /dev/fd
ln -snf fd/0 /dev/stdin
ln -snf fd/1 /dev/stdout
ln -snf fd/2 /dev/stderr
[ -e /proc/kcore ] && ln -snf /proc/kcore /dev/core

# Setting up mdev as hotplug agent
if [ -e /proc/sys/kernel/hotplug ]
then
    echo /sbin/mdev > /proc/sys/kernel/hotplug
fi

# Loading kernel modules for detected hardware
env -i /sbin/mdev -s
# mdev -s does not poke network interfaces or usb devices so we need to do it here.
for i in /sys/class/net/*/uevent; do printf 'add' > "$i"; done 2>/dev/null; unset i
for i in /sys/bus/usb/devices/*; do
    case "${i##*/}" in
        [0-9]*-[0-9]*)
            printf 'add' > "$i/uevent"
        ;;
    esac
done; unset i

# Load kernel modules, run twice.
find /sys -name 'modalias' -type f -exec cat '{}' + | sort -u | xargs modprobe -b -a 2>/dev/null
find /sys -name 'modalias' -type f -exec cat '{}' + | sort -u | xargs modprobe -b -a 2>/dev/null


hwclock -u -s

swapon -a

hostname $(cat /etc/hostname)

/etc/init.d/checkfs start


###########
# mountfs #
###########

echo "Remounting root file system in read-write mode..."
mount -o remount,rw / >/dev/null

# Remove fsck-related file system watermarks.
rm -f /fastboot /forcefsck

# This will mount all filesystems that do not have _netdev in
# their option list.  _netdev denotes a network filesystem.

echo "Mounting remaining file systems..."
mount -a -O no_netdev >/dev/null


###########
# cleanfs #
###########

echo "Cleaning file systems..." 

if [ "${SKIPTMPCLEAN}" = "" ]; then
   cd /tmp &&
   find . -xdev -mindepth 1 ! -name lost+found -delete
fi

> /var/run/utmp

if grep -q '^utmp:' /etc/group ; then
   chmod 664 /var/run/utmp
   chgrp utmp /var/run/utmp
fi


##########
# sysctl #
##########

if [ -f "/etc/sysctl.conf" ]; then
    echo "Setting kernel runtime parameters..."
    sysctl -q -p
fi


##########
# random #
##########

echo "Initializing kernel random number generator..."
if [ -f /var/tmp/random-seed ]; then
    /bin/cat /var/tmp/random-seed >/dev/urandom
fi
/bin/dd if=/dev/urandom of=/var/tmp/random-seed count=1 >/dev/null 2>&1

