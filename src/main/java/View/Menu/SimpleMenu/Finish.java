package View.Menu.SimpleMenu;


import View.Console;
import View.Menu.AdminMenu.MainAdmin;

public class Finish extends MainSimple {

    public Finish(Console console) {
        super(console, "exit");

    }
    public void execute(){
        console.finish();
    }
}