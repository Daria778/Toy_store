package View.Menu.SimpleMenu;

import View.Console;
import View.Menu.AdminMenu.MainAdmin;

public class ShowYourToys extends MainSimple {

    public ShowYourToys(Console console) {
        super(console, "show your toys");

    }

    public void execute() {
        console.showYourToys();
    }
}
