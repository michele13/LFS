EXTDIR=${DESTDIR}/etc
LIBDIR=${DESTDIR}/lib/services
MAN8=${DESTDIR}/usr/share/man/man8
SBIN=${DESTDIR}/sbin
MODE=754
DIRMODE=755
CONFMODE=644

all: links

install: all

create-dirs:
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/rcS.d
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/rc3.d
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/rc0.d
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/init.d
	install -d -m ${DIRMODE}  ${EXTDIR}/sysconfig
	install -d -m ${DIRMODE}  ${LIBDIR}
	install -d -m ${DIRMODE}  ${MAN8}
	install -d -m ${DIRMODE}  ${SBIN}
	ln -sfn       services    ${DESTDIR}/lib/lsb
	ln -sfn       rc.d/init.d ${EXTDIR}/init.d

files: create-dirs 
	install -m ${MODE} lfs/init.d/checkfs       ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/cleanfs       ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/halt          ${EXTDIR}/rc.d/init.d/
	install -m ${CONFMODE} lfs/init.d/functions ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/localnet      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/mdev          ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/mountfs       ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/mountvirtfs   ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/network       ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/ntpd          ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/oneandonly    ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/random        ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/rc            ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/reboot        ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/sendsignals   ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/setclock      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/swap          ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/sysctl        ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/sysklogd      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/template      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/sbin/ifup            ${SBIN}
	install -m ${MODE} lfs/sbin/ifdown          ${SBIN}
	install -m ${MODE} lfs/sbin/ifup.8          ${MAN8}
	ln -sf  ifup.8                              ${MAN8}/ifdown.8
	install -m ${MODE} lfs/lib/services/ipv4-static-route  ${LIBDIR}
	install -m ${MODE} lfs/lib/services/ipv4-static        ${LIBDIR}
	install -m ${CONFMODE} lfs/lib/services/init-functions ${LIBDIR}
	if [ ! -f ${EXTDIR}/sysconfig/createfiles ]; then \
          install -m ${CONFMODE} lfs/sysconfig/createfiles ${EXTDIR}/sysconfig/ ;\
        fi
	if [ ! -f ${EXTDIR}/sysconfig/rc.site     ]; then \
          install -m ${CONFMODE} lfs/sysconfig/rc.site     ${EXTDIR}/sysconfig/ ;\
        fi

links: rcS rc3 rc0

rcS: files
	ln -sf ../init.d/oneandonly  ${EXTDIR}/rc.d/rcS.d/oneandonly

rc3: files
	ln -sf ../init.d/sysklogd    ${EXTDIR}/rc.d/rc3.d/S10sysklogd
	ln -sf ../init.d/network     ${EXTDIR}/rc.d/rc3.d/S20network
	ln -sf ../init.d/random      ${EXTDIR}/rc.d/rc3.d/S25random
	ln -sf ../init.d/ntpd        ${EXTDIR}/rc.d/rc3.d/S26ntpd

rc0: files
	ln -sf ../init.d/random      ${EXTDIR}/rc.d/rc0.d/S45random
	ln -sf ../init.d/ntpd        ${EXTDIR}/rc.d/rc0.d/S46ntpd
	ln -sf ../init.d/setclock    ${EXTDIR}/rc.d/rc0.d/S46setclock
	ln -sf ../init.d/network     ${EXTDIR}/rc.d/rc0.d/S80network
	ln -sf ../init.d/sysklogd    ${EXTDIR}/rc.d/rc0.d/S90sysklogd
	ln -sf ../init.d/localnet    ${EXTDIR}/rc.d/rc0.d/S96localnet
	ln -sf ../init.d/sendsignals ${EXTDIR}/rc.d/rc0.d/S97sendsignals
	ln -sf ../init.d/swap        ${EXTDIR}/rc.d/rc0.d/S98swap
	ln -sf ../init.d/mountfs     ${EXTDIR}/rc.d/rc0.d/S99mountfs

uninstall:
	rm -rf ${DESTDIR}/lib/services ${DESTDIR}/lib/lsb ${EXTDIR}/rc.d ${EXTDIR}/init.d \
               ${SBIN}/ifup ${SBIN}/ifdown ${MAN8}/ifup.8 ${MAN8}/ifdown.8 \
               ${EXTDIR}/sysconfig/rc 

.PHONY: all create-dirs install files links rcS rc3 rc6 uninstall

