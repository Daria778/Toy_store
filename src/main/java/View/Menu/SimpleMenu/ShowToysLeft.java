package View.Menu.SimpleMenu;

import View.Console;

public class ShowToysLeft extends MainSimple {

    public ShowToysLeft(Console console) {
        super(console, "show toys left");

    }

    public void execute() {
        console.showToysLeft();
    }
}