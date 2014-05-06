My personal modifications to the LFS (http://www.linuxfromscratch.org/lfs/) book.

This book is periodically generated at: http://igor-zivkovic.from.hr/LFS/

## Modifications:
* added busybox, lsb-release, and mdev-like-a-boss
* added parts of postlfs chapter from blfs
* replaced systemd-udev with mdev from busybox
* replaced pkg-config with pkgconf
* replaced bzip2, coreutils, diffutils, file, findutils, gettext, grep, zip,
  patch, sed, tar, and xz with busybox in chapter 5
* replaced coreutils, diffutils, findutils, grep, inetutils, iproute2, kmod,
  less, man-db, patch, procps-ng, psmisc, sed, shadow, tar, util-linux, and vim
  with busybox in chapter 6
* removed autoconf, automake, dejagnu, expect, gettext, tcl, and texinfo
* disabled native language support
* shadow: fix newer glibc crypt()'s handling of an invalid seed
* added fortran to gcc languages in chapter 6
* automatically set number of make jobs depending on /proc/cpuinfo
* moved patches to github repo
* disabled static libraries where possible with the configure switch
* removed tests
* removed steps for additional documentation installation
* removed docdir configure switches
* utf8 for html output encoding
* change render directory to /tmp
* various other minor changes

* used busybox commands:
    /bin/base64
    /bin/cat
    /bin/chgrp
    /bin/chmod
    /bin/chown
    /bin/cp
    /bin/date
    /bin/dd
    /bin/df
    /bin/dmesg
    /bin/dnsdomainname
    /bin/echo
    /bin/egrep
    /bin/false
    /bin/fgrep
    /bin/getopt
    /bin/grep
    /bin/hostname
    /bin/ionice
    /bin/kill
    /bin/linux32
    /bin/linux64
    /bin/ln
    /bin/login
    /bin/ls
    /bin/mkdir
    /bin/mknod
    /bin/mktemp
    /bin/more
    /bin/mount
    /bin/mountpoint
    /bin/mv
    /bin/netstat
    /bin/nice
    /bin/pidof
    /bin/ping
    /bin/ping6
    /bin/printenv
    /bin/ps
    /bin/pwd
    /bin/rev
    /bin/rm
    /bin/rmdir
    /bin/scriptreplay
    /bin/sed
    /bin/setarch
    /bin/sleep
    /bin/stat
    /bin/stty
    /bin/su
    /bin/sync
    /bin/tar
    /bin/touch
    /bin/true
    /bin/umount
    /bin/uname
    /bin/vi
    /bin/watch
    /sbin/acpid
    /sbin/blkid
    /sbin/blockdev
    /sbin/depmod
    /sbin/fdisk
    /sbin/findfs
    /sbin/fsck.minix
    /sbin/fstrim
    /sbin/getty
    /sbin/hwclock
    /sbin/ifconfig
    /sbin/insmod
    /sbin/ip
    /sbin/losetup
    /sbin/lsmod
    /sbin/mdev
    /sbin/mkfs.minix
    /sbin/mkswap
    /sbin/modinfo
    /sbin/modprobe
    /sbin/pivot_root
    /sbin/rmmod
    /sbin/sulogin
    /sbin/swapoff
    /sbin/swapon
    /sbin/switch_root
    /sbin/sysctl
    /usr/bin/basename
    /usr/bin/cal
    /usr/bin/chrt
    /usr/bin/cksum
    /usr/bin/cmp
    /usr/bin/comm
    /usr/bin/cut
    /usr/bin/diff
    /usr/bin/dirname
    /usr/bin/dos2unix
    /usr/bin/du
    /usr/bin/eject
    /usr/bin/env
    /usr/bin/expand
    /usr/bin/expr
    /usr/bin/find
    /usr/bin/flock
    /usr/bin/fold
    /usr/bin/free
    /usr/bin/fuser
    /usr/bin/groups
    /usr/bin/head
    /usr/bin/hexdump
    /usr/bin/hostid
    /usr/bin/id
    /usr/bin/install
    /usr/bin/ipcrm
    /usr/bin/ipcs
    /usr/bin/killall
    /usr/bin/last
    /usr/bin/less
    /usr/bin/logger
    /usr/bin/logname
    /usr/bin/lspci
    /usr/bin/lsusb
    /usr/bin/man
    /usr/bin/md5sum
    /usr/bin/mkfifo
    /usr/bin/nohup
    /usr/bin/od
    /usr/bin/passwd
    /usr/bin/patch
    /usr/bin/pgrep
    /usr/bin/pkill
    /usr/bin/pmap
    /usr/bin/printf
    /usr/bin/pstree
    /usr/bin/pwdx
    /usr/bin/readlink
    /usr/bin/realpath
    /usr/bin/renice
    /usr/bin/script
    /usr/bin/seq
    /usr/bin/setsid
    /usr/bin/sha1sum
    /usr/bin/sha256sum
    /usr/bin/sha3sum
    /usr/bin/sha512sum
    /usr/bin/sort
    /usr/bin/split
    /usr/bin/sum
    /usr/bin/tac
    /usr/bin/tail
    /usr/bin/tee
    /usr/bin/telnet
    /usr/bin/test
    /usr/bin/tftp
    /usr/bin/timeout
    /usr/bin/top
    /usr/bin/tr
    /usr/bin/traceroute
    /usr/bin/traceroute6
    /usr/bin/tty
    /usr/bin/unexpand
    /usr/bin/uniq
    /usr/bin/unix2dos
    /usr/bin/unzip
    /usr/bin/uptime
    /usr/bin/users
    /usr/bin/uudecode
    /usr/bin/uuencode
    /usr/bin/vlock
    /usr/bin/wall
    /usr/bin/wc
    /usr/bin/wget
    /usr/bin/which
    /usr/bin/who
    /usr/bin/whoami
    /usr/bin/whois
    /usr/bin/xargs
    /usr/bin/yes
    /usr/sbin/addgroup
    /usr/sbin/adduser
    /usr/sbin/chpasswd
    /usr/sbin/chroot
    /usr/sbin/delgroup
    /usr/sbin/deluser
    /usr/sbin/fdformat
    /usr/sbin/ftpd
    /usr/sbin/inetd
    /usr/sbin/ntpd
    /usr/sbin/readprofile
    /usr/sbin/rtcwake
    /usr/sbin/telnetd
    /usr/sbin/tftpd
