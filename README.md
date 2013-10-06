My personal modifications to the BLFS (http://www.linuxfromscratch.org/blfs/)
book mainly with addition of a bunch of packages I regularly compile but don't
want to place the burden of maintenance on BLFS editors by adding them to the
official project.

Since this is my playground, I removed packages I don't use like desktop
environments, Java, GTK+3, D-Bus, PulseAudio, polkit, GObject introspection,
Linux-PAM and similar. I also removed instructons for additional documentation
and examples installation, testing, debugging and all associated dependencies.

This book is periodically generated at: http://igor-zivkovic.from.hr/BLFS/

It is tracking changes from the official BLFS in SVN trunk and should be
compatible with the latest LFS from SVN trunk.

Changes not in sync with the official book (mostly removed and added packages)
are noted at: https://raw.github.com/igzivkov/blfs-book/master/ChangeLog
