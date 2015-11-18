SHELL=/bin/sh

ETCDIR=/etc
LIBDIR=${DESTDIR}/lib/services
EXTDIR=${DESTDIR}${ETCDIR}
MODE=754
DIRMODE=755
CONFMODE=644

all:
	@grep "^install" Makefile | cut -d ":" -f 1
	@echo "Select an appropriate install target from the above list" 

create-dirs:
	install -d -m ${DIRMODE} ${EXTDIR}/rc.d/rc0.d
	install -d -m ${DIRMODE} ${EXTDIR}/rc.d/rc3.d
	install -d -m ${DIRMODE} ${EXTDIR}/rc.d/rcS.d
	install -d -m ${DIRMODE} ${EXTDIR}/rc.d/init.d
	install -d -m ${DIRMODE} ${EXTDIR}/sysconfig

create-service-dir:
	install -d -m ${DIRMODE} ${LIBDIR}

install-service-dhclient: create-service-dir
	install -m ${MODE} blfs/services/dhclient ${LIBDIR}

install-service-dhcpcd: create-service-dir
	install -m ${MODE} blfs/services/dhcpcd  ${LIBDIR}

install-service-bridge: create-service-dir
	install -m ${MODE} blfs/services/bridge  ${LIBDIR}

install-service-ipx: create-service-dir
	install -m ${MODE} blfs/services/ipx ${LIBDIR}

install-service-pppoe: create-service-dir
	install -m ${MODE} blfs/services/pppoe  ${LIBDIR}
	install -d -m ${DIRMODE} ${EXTDIR}/ppp/peers
	install -m ${CONFMODE} blfs/ppp/pppoe ${EXTDIR}/ppp/peers

install-service-wpa: create-service-dir
	install -m ${MODE} blfs/services/wpa ${LIBDIR}

install-acpid: create-dirs
	install -m ${MODE} blfs/init.d/acpid       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc0.d/K32acpid
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc1.d/K32acpid
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc2.d/S18acpid
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc3.d/S18acpid
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc4.d/S18acpid
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc5.d/S18acpid
	ln -sf  ../init.d/acpid ${EXTDIR}/rc.d/rc6.d/K32acpid

install-kbd:
	install -m ${MODE} blfs/init.d/console ${EXTDIR}/rc.d/init.d/
	ln -sf ../init.d/console ${EXTDIR}/rc.d/rc3.d/S06console

install-alsa: create-dirs
	install -m ${MODE} blfs/init.d/alsa       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/alsa ${EXTDIR}/rc.d/rc0.d/S35alsa
	ln -sf  ../init.d/alsa ${EXTDIR}/rc.d/rc3.d/S05alsa

install-php: create-dirs
	install -m ${MODE} blfs/init.d/php-fpm     ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/php-fpm ${EXTDIR}/rc.d/rc0.d/S28php-fpm
	ln -sf  ../init.d/php-fpm ${EXTDIR}/rc.d/rc3.d/S32php-fpm

install-autofs: create-dirs
	install -m $(MODE) blfs/init.d/autofs    $(EXTDIR)/rc.d/init.d/
	install -m $(CONFMODE) blfs/sysconfig/autofs.conf $(EXTDIR)/sysconfig/
	ln -sf  ../init.d/autofs $(EXTDIR)/rc.d/rc3.d/S04autofs

install-atd: create-dirs
	install -m ${MODE} blfs/init.d/atd       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/atd ${EXTDIR}/rc.d/rc0.d/S29atd
	ln -sf  ../init.d/atd ${EXTDIR}/rc.d/rc3.d/S68atd

install-saslauthd: create-dirs
	install -m ${MODE} blfs/init.d/saslauthd ${EXTDIR}/rc.d/init.d/saslauthd
	install -m ${CONFMODE} blfs/sysconfig/saslauthd ${EXTDIR}/sysconfig/saslauthd
	ln -sf  ../init.d/saslauthd ${EXTDIR}/rc.d/rc0.d/S49saslauthd
	ln -sf  ../init.d/saslauthd ${EXTDIR}/rc.d/rc3.d/S24saslauthd

install-dovecot: create-dirs
	install -m ${MODE} blfs/init.d/dovecot       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/dovecot ${EXTDIR}/rc.d/rc0.d/S78dovecot
	ln -sf  ../init.d/dovecot ${EXTDIR}/rc.d/rc3.d/S27dovecot

install-dhcpd: create-dirs
	install -m ${MODE} blfs/init.d/dhcpd       ${EXTDIR}/rc.d/init.d/dhcpd
	install -m ${CONFMODE} blfs/sysconfig/dhcpd ${EXTDIR}/sysconfig/dhcpd
	ln -sf  ../init.d/dhcpd ${EXTDIR}/rc.d/rc0.d/S30dhcpd
	ln -sf  ../init.d/dhcpd ${EXTDIR}/rc.d/rc3.d/S30dhcpd

install-exim: create-dirs
	install -m ${MODE} blfs/init.d/exim       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/exim ${EXTDIR}/rc.d/rc0.d/S25exim
	ln -sf  ../init.d/exim ${EXTDIR}/rc.d/rc3.d/S35exim

install-fcron: create-dirs
	install -m ${MODE} blfs/init.d/fcron      ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/fcron ${EXTDIR}/rc.d/rc0.d/S08fcron
	ln -sf  ../init.d/fcron ${EXTDIR}/rc.d/rc3.d/S40fcron

install-gpm: create-dirs
	install -m ${MODE} blfs/init.d/gpm        ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/gpm ${EXTDIR}/rc.d/rc0.d/S10gpm
	ln -sf  ../init.d/gpm ${EXTDIR}/rc.d/rc3.d/S70gpm

install-haveged: create-dirs
	install -m ${MODE} blfs/init.d/haveged        ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/haveged ${EXTDIR}/rc.d/rc0.d/S90haveged
	ln -sf  ../init.d/haveged ${EXTDIR}/rc.d/rc3.d/S21haveged

install-iptables: create-dirs
	install -m ${MODE} blfs/init.d/iptables        ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/iptables ${EXTDIR}/rc.d/rc3.d/S19iptables

install-netfs: create-dirs
	install -m ${MODE} blfs/init.d/netfs      ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/netfs ${EXTDIR}/rc.d/rc0.d/S47netfs
	ln -sf  ../init.d/netfs ${EXTDIR}/rc.d/rc3.d/S28netfs

install-nfs-client: create-dirs
	install -m ${MODE} blfs/init.d/nfs-client ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/nfs-client ${EXTDIR}/rc.d/rc0.d/S48nfs-client
	ln -sf  ../init.d/nfs-client ${EXTDIR}/rc.d/rc3.d/S24nfs-client

install-nfs-server: create-dirs
	install -m ${MODE} blfs/init.d/nfs-server ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/nfs-server ${EXTDIR}/rc.d/rc0.d/S48nfs-server
	ln -sf  ../init.d/nfs-server ${EXTDIR}/rc.d/rc3.d/S24nfs-server

install-proftpd: create-dirs
	install -m ${MODE} blfs/init.d/proftpd    ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/proftpd ${EXTDIR}/rc.d/rc0.d/S28proftpd
	ln -sf  ../init.d/proftpd ${EXTDIR}/rc.d/rc3.d/S32proftpd

install-rpcbind: create-dirs
	install -m ${MODE} blfs/init.d/rpcbind    ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/rpcbind ${EXTDIR}/rc.d/rc0.d/S49rpcbind
	ln -sf  ../init.d/rpcbind ${EXTDIR}/rc.d/rc3.d/S22rpcbind

install-rsyncd: create-dirs
	install -m ${MODE} blfs/init.d/rsyncd     ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/rsyncd ${EXTDIR}/rc.d/rc0.d/S30rsyncd
	ln -sf  ../init.d/rsyncd ${EXTDIR}/rc.d/rc3.d/S30rsyncd

install-sshd: create-dirs
	install -m ${MODE} blfs/init.d/sshd       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/sshd ${EXTDIR}/rc.d/rc0.d/S30sshd
	ln -sf  ../init.d/sshd ${EXTDIR}/rc.d/rc3.d/S30sshd

install-stunnel: create-dirs
	install -m ${MODE} blfs/init.d/stunnel    ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/stunnel ${EXTDIR}/rc.d/rc0.d/S47stunnel
	ln -sf  ../init.d/stunnel ${EXTDIR}/rc.d/rc3.d/S55stunnel

install-unbound: create-dirs
	install -m ${MODE} blfs/init.d/unbound       ${EXTDIR}/rc.d/init.d/
	ln -sf  ../init.d/unbound ${EXTDIR}/rc.d/rc0.d/S79unbound
	ln -sf  ../init.d/unbound ${EXTDIR}/rc.d/rc3.d/S21unbound

install-xinetd: create-dirs
	install -m ${MODE} blfs/init.d/xinetd     ${EXTDIR}/rc.d/init.d/
	ln -sf ../init.d/xinetd ${EXTDIR}/rc.d/rc0.d/S49xinetd
	ln -sf ../init.d/xinetd ${EXTDIR}/rc.d/rc3.d/S23xinetd

uninstall-atd: 
	rm -f ${EXTDIR}/rc.d/init.d/atd
	rm -f ${EXTDIR}/rc.d/rc0.d/S29atd
	rm -f ${EXTDIR}/rc.d/rc3.d/S68atd

uninstall-alsa:
	rm -f ${EXTDIR}/rc.d/init.d/alsa
	rm -f ${EXTDIR}/rc.d/rc0.d/S35alsa
	rm -f ${EXTDIR}/rc.d/rc3.d/S05alsa

uninstall-php:
	rm -f ${EXTDIR}/rc.d/init.d/php-fpm
	rm -f ${EXTDIR}/rc.d/rc0.d/S28php-fpm
	rm -f ${EXTDIR}/rc.d/rc3.d/S32php-fpm

uninstall-autofs:
	rm -f $(EXTDIR)/rc.d/init.d/autofs
	rm -f $(EXTDIR)/rc.d/rc3.d/S04autofs

uninstall-saslauthd:
	rm -f ${EXTDIR}/rc.d/init.d/saslauthd
	rm -f ${EXTDIR}/sysconfig/saslauthd
	rm -f ${EXTDIR}/rc.d/rc0.d/S49saslauthd
	rm -f ${EXTDIR}/rc.d/rc3.d/S24saslauthd

uninstall-dhcpd:
	rm -f ${EXTDIR}/rc.d/init.d/dhcpd
	rm -f ${EXTDIR}/sysconfig/dhcpd
	rm -f ${EXTDIR}/rc.d/rc0.d/S30dhcpd
	rm -f ${EXTDIR}/rc.d/rc3.d/S30dhcpd

uninstall-dovecot:
	rm -f ${EXTDIR}/rc.d/init.d/dovecot
	rm -f ${EXTDIR}/rc.d/rc0.d/S78dovecot
	rm -f ${EXTDIR}/rc.d/rc3.d/S27dovecot

uninstall-exim:
	rm -f ${EXTDIR}/rc.d/init.d/exim
	rm -f ${EXTDIR}/rc.d/rc0.d/S25exim
	rm -f ${EXTDIR}/rc.d/rc3.d/S35exim

uninstall-fcron:
	rm -f ${EXTDIR}/rc.d/init.d/fcron
	rm -f ${EXTDIR}/rc.d/rc0.d/S08fcron
	rm -f ${EXTDIR}/rc.d/rc3.d/S40fcron

uninstall-gpm:
	rm -f ${EXTDIR}/rc.d/init.d/gpm
	rm -f ${EXTDIR}/rc.d/rc0.d/S10gpm
	rm -f ${EXTDIR}/rc.d/rc3.d/S70gpm

uninstall-haveged:
	rm -f ${EXTDIR}/rc.d/init.d/haveged
	rm -f ${EXTDIR}/rc.d/rc0.d/S90haveged
	rm -f ${EXTDIR}/rc.d/rc3.d/S21haveged

uninstall-iptables:
	rm -f ${EXTDIR}/rc.d/init.d/iptables
	rm -f ${EXTDIR}/rc.d/rc3.d/S19iptables

uninstall-netfs:
	rm -f ${EXTDIR}/rc.d/init.d/netfs
	rm -f ${EXTDIR}/rc.d/rc0.d/S47netfs
	rm -f ${EXTDIR}/rc.d/rc3.d/S28netfs

uninstall-nfs-client:
	rm -f ${EXTDIR}/rc.d/init.d/nfs-client
	rm -f ${EXTDIR}/rc.d/rc0.d/S48nfs-client
	rm -f ${EXTDIR}/rc.d/rc3.d/S24nfs-client

uninstall-nfs-server:
	rm -f ${EXTDIR}/rc.d/init.d/nfs-server
	rm -f ${EXTDIR}/rc.d/rc0.d/S48nfs-server
	rm -f ${EXTDIR}/rc.d/rc3.d/S24nfs-server

uninstall-proftpd:
	rm -f ${EXTDIR}/rc.d/init.d/proftpd
	rm -f ${EXTDIR}/rc.d/rc0.d/S28proftpd
	rm -f ${EXTDIR}/rc.d/rc3.d/S32proftpd

uninstall-rpcbind: 
	rm -f ${EXTDIR}/rc.d/init.d/rpcbind
	rm -f ${EXTDIR}/rc.d/rc0.d/S49rpcbind
	rm -f ${EXTDIR}/rc.d/rc3.d/S22rpcbind

uninstall-rsyncd:
	rm -f ${EXTDIR}/rc.d/init.d/rsyncd
	rm -f ${EXTDIR}/rc.d/rc0.d/S30rsyncd
	rm -f ${EXTDIR}/rc.d/rc3.d/S30rsyncd

uninstall-sshd:
	rm -f ${EXTDIR}/rc.d/init.d/sshd
	rm -f ${EXTDIR}/rc.d/rc0.d/S30sshd
	rm -f ${EXTDIR}/rc.d/rc3.d/S30sshd

uninstall-stunnel:
	rm -f ${EXTDIR}/rc.d/init.d/stunnel
	rm -f ${EXTDIR}/rc.d/rc0.d/S47stunnel
	rm -f ${EXTDIR}/rc.d/rc3.d/S55stunnel

uninstall-unbound:
	rm -f ${EXTDIR}/rc.d/init.d/unbound
	rm -f ${EXTDIR}/rc.d/rc0.d/S79unbound
	rm -f ${EXTDIR}/rc.d/rc3.d/S21unbound

uninstall-xinetd:
	rm -f ${EXTDIR}/rc.d/init.d/xinetd
	rm -f ${EXTDIR}/rc.d/rc0.d/S49xinetd
	rm -f ${EXTDIR}/rc.d/rc3.d/S23xinetd

.PHONY: all create-dirs create-service-dir \
	install-service-dhclient \
	install-service-dhcpcd \
	install-service-ipx \
	install-service-pppoe \
	install-atd \
	install-alsa \
	install-php \
	install-saslauthd \
	install-dhcpd \
	install-dovecot \
	install-exim \
	install-fcron \
	install-gpm \
	install-iptables \
	install-netfs \
	install-nfs-client \
	install-nfs-server \
	install-proftpd \
	install-rsync \
	install-sshd \
	install-stunnel \
	install-unbound \
	install-xinetd \
	uninstall-atd \
	uninstall-alsa \
	uninstall-php \
	uninstall-saslauthd \
	uninstall-dhcpd \
	uninstall-dovecot \
	uninstall-exim \
	uninstall-fcron \
	uninstall-gpm \
	uninstall-iptables \
	uninstall-netfs \
	uninstall-nfs-client \
	uninstall-nfs-server \
	uninstall-proftpd \
	uninstall-rsync \
	uninstall-sshd \
	uninstall-stunnel \
	uninstall-unbound \
	uninstall-xinetd
