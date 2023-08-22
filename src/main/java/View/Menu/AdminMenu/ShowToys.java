package View.Menu.AdminMenu;

import View.Console;

public class ShowToys extends MainAdmin {

    public ShowToys(Console console) {
        super(console, "show toys");

    }

    public void execute() {
        console.showToys();
    }
}
