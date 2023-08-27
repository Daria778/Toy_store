package View.Menu.AdminMenu;

import View.Console;

public class Save extends MainAdmin {

    public Save(Console console) {
        super(console, "save toys");
    }

    public void execute(){
        console.save();
    }
}
