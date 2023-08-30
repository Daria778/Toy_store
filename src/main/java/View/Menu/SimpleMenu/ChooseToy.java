package View.Menu.SimpleMenu;

import View.Console;

public class ChooseToy extends MainSimple {

    public ChooseToy(Console console) {
        super(console, "choose toy");

    }
    public void execute(){
        console.chooseToy();
    }
}
