//gtkmm3_test.cpp - test from https://wiki.gnome.org/Projects/gtkmm/MSWindows

#include <gtkmm.h>

int main(int argc, char** argv)
{
        auto app = Gtk::Application::create(argc, argv);
        
        Gtk::Window window;
        window.set_default_size(600,400);
        
        return app->run(window);
}