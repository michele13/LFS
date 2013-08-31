My personal modifications to the BLFS (http://www.linuxfromscratch.org/blfs/)
book with the main goal to add a bunch of packages I regularly compile but don't
want to place the burden of maintenance on BLFS editors by adding them to the
official book. Since this is my playground I removed stuff I don't use like:

* packages I think don't add much value but complicate instructions
  significantly, like for example: desktop environments, Java, GTK+3, D-Bus,
  PulseAudio, GObject introspection, Linux-PAM and similar

* additional documentation installation since I read it online anyways

* testing and debugging instructions as I don't find it that useful

* package dependencies only used for building additional documentation,
  example programs or testing



This book is periodically generated at: http://igor-zivkovic.from.hr/BLFS/

It is tracking changes from the official BLFS in SVN trunk and should be
compatible with the latest LFS in SVN trunk.

Major changes not in sync with the official book (mainly removed and added
packages) are noted at: https://raw.github.com/igzivkov/blfs-book/master/ChangeLog
