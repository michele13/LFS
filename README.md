My personal modifications to the BLFS (http://www.linuxfromscratch.org/blfs/)
book with the goals to:

* remove packages I think don't add much value but complicate instructions
  significantly, like for example: desktop environments, Java, GTK+3, D-Bus,
  PulseAudio, GObject introspection, Linux-PAM and similar

* remove additional documentation installation since I read it online anyways

* remove testing and debugging instructions as I don't find it that useful

* remove package dependencies only used for building additional documentation,
  example programs or testing

* add a bunch of packages I regularly compile but don't want to place the burden
  of maintainance on the official book editors.


This book is periodically generated at: http://igor-zivkovic.from.hr/BLFS/

It is tracking changes from the official BLFS book from SVN trunk and should be
compatible with the latest LFS from SVN trunk.

Major changes from the official book (mainly removed and added packages) are
noted at: https://raw.github.com/igzivkov/blfs-book/master/ChangeLog
