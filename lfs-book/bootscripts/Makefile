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
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/rc3.d
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/rc0.d
	install -d -m ${DIRMODE}  ${EXTDIR}/rc.d/init.d
	install -d -m ${DIRMODE}  ${EXTDIR}/sysconfig
	install -d -m ${DIRMODE}  ${LIBDIR}
	install -d -m ${DIRMODE}  ${MAN8}
	install -d -m ${DIRMODE}  ${SBIN}
	ln -sfn       rc.d/init.d ${EXTDIR}/init.d

files: create-dirs 
	install -m ${CONFMODE} lfs/init.d/functions ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/localnet      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/mountfs       ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/network       ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/rc.boot       ${EXTDIR}
	install -m ${MODE} lfs/init.d/rc.shutdown   ${EXTDIR}
	install -m ${MODE} lfs/init.d/rc            ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/sysklogd      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/init.d/template      ${EXTDIR}/rc.d/init.d/
	install -m ${MODE} lfs/sbin/ifup            ${SBIN}
	install -m ${MODE} lfs/sbin/ifdown          ${SBIN}
	install -m ${MODE} lfs/sbin/ifup.8          ${MAN8}
	ln -sf  ifup.8                              ${MAN8}/ifdown.8
	install -m ${MODE} lfs/lib/services/ipv4-static-route  ${LIBDIR}
	install -m ${MODE} lfs/lib/services/ipv4-static        ${LIBDIR}
	install -m ${CONFMODE} lfs/lib/services/init-functions ${LIBDIR}

links: rc3 rc0

rc3: files
	ln -sf ../init.d/sysklogd    ${EXTDIR}/rc.d/rc3.d/S10sysklogd
	ln -sf ../init.d/network     ${EXTDIR}/rc.d/rc3.d/S20network

rc0: files
	ln -sf ../init.d/network     ${EXTDIR}/rc.d/rc0.d/S80network
	ln -sf ../init.d/sysklogd    ${EXTDIR}/rc.d/rc0.d/S90sysklogd
	ln -sf ../init.d/localnet    ${EXTDIR}/rc.d/rc0.d/S96localnet
	ln -sf ../init.d/mountfs     ${EXTDIR}/rc.d/rc0.d/S99mountfs

uninstall:
	rm -rf ${DESTDIR}/lib/services ${EXTDIR}/rc.d ${EXTDIR}/init.d \
               ${SBIN}/ifup ${SBIN}/ifdown ${MAN8}/ifup.8 ${MAN8}/ifdown.8 \
               ${EXTDIR}/sysconfig/rc 

.PHONY: all create-dirs install files links rc3 rc6 uninstall

