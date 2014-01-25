My personal modifications to the LFS (http://www.linuxfromscratch.org/lfs/) book.

This book is periodically generated at: http://igor-zivkovic.from.hr/LFS/

## Modifications:
* added attr, acl, libcap, lsb-release, pcre, and which packages
* added parts of postlfs chapter from blfs
* replaced systemd-udev with eudev
* replaced pkg-config with pkgconf
* removed texinfo
* shadow: fix newer glibc crypt()'s handling of an invalid seed
* added fortran to gcc languages in chapter 6
* automatically set number of make jobs depending on /proc/cpuinfo
* moved patches to github repo
* disabled static libraries where possible with the configure switch
* removed steps for additional documentation installation
* removed docdir configure switches
* utf8 for html output encoding
* change render directory to /tmp
* various other minor changes
