package View.Menu.AdminMenu;

import View.Console;

public class ShowYourToys extends MainAdmin {

    public ShowYourToys(Console console) {
        super(console, "show your toys");

    }

    public void execute() {
        console.showYourToys();
    }
}
