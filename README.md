My personal modifications to the LFS (http://www.linuxfromscratch.org/lfs/) book.

This book is periodically generated at: http://igor-zivkovic.from.hr/LFS/

## Modifications:
* added attr, acl, busybox, libcap, lsb-release, mdev-like-a-boss, and pcre
* added parts of postlfs chapter from blfs
* replaced systemd-udev with mdev from busybox
* replaced pkg-config with pkgconf
* replaced bzip2, coreutils, diffutils, file, findutils, gettext, grep, zip,
  patch, sed, tar, and xz with busybox in chapter 5
* replaced less, patch, tar, and vim with busybox in chapter 6
* removed dejagnu, expect, tcl, and texinfo
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
    /bin/more
    /bin/tar
    /bin/vi
    /sbin/acpid
    /sbin/mdev
    /usr/bin/less
    /usr/bin/patch
    /usr/bin/unzip
    /usr/bin/wget
    /usr/bin/which
    /usr/bin/whois
