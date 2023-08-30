package View.Menu.AdminMenu;

import View.Console;


public class ShowToysLeft extends MainAdmin {

    public ShowToysLeft(Console console) {
        super(console, "show toys left");

    }

    public void execute() {
        console.showToysLeft();
    }
}
