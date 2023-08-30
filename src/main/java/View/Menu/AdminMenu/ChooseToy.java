package View.Menu.AdminMenu;

import View.Console;

public class ChooseToy extends MainAdmin {

    public ChooseToy(Console console) {
        super(console, "choose toy");

    }
    public void execute(){
        console.chooseToy();
    }
}
