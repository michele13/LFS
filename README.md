My personal modifications to the BLFS (http://www.linuxfromscratch.org/blfs/)
book with the goal to remove packages I don't use like, for example, desktop
environments, Java, GTK+3, D-Bus, PulseAudio, GObject introspection, Vala,
GTK-Doc and similar. Other minor modifications are removed package testing
instructions and additional documentation installation (except man pages) as I
don't find them that useful. Another goal is to add a bunch of packages I use
but don't want to place the burden of maintainance on the official book editors.

This book is automatically generated at: http://igor-zivkovic.from.hr/BLFS/

It is tracking the official BLFS book from SVN trunk and should be compatible
with the latest LFS from SVN trunk. Older versions are not supported.

Major changes from the official book (mainly removed and added packages) are
noted at: https://raw.github.com/igzivkov/blfs-book/master/ChangeLog
