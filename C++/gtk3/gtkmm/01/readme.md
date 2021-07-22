# Tutorials for gtk 3.x using gtkmm
Very simple first tutorial: https://wiki.gnome.org/Projects/gtkmm/MSWindows

## Build
1. Open MSYS2 shell (`msys2_shell.cmd`)
2. Run following commands

```
export PKG_CONFIG_PATH=/mingw64/lib/pkgconfig:$PKG_CONFIG_PATH
export PATH=/mingw64/bin/:$PATH
g++ -std=c++11 gtkmm3_test.cpp $(pkg-config gtkmm-3.0 --cflags --libs | sed 's/ -I/ -isystem /g') -o gtkmm3_test.exe

```
