package View.Menu.SimpleMenu;

import View.Console;
import View.Menu.AdminMenu.MainAdmin;

public class ShowToys extends MainSimple {

    public ShowToys(Console console) {
        super(console, "show toys");

    }

    public void execute() {
        console.showToys();
    }
}
