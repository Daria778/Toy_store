package View.Menu.AdminMenu;


import View.Console;

public class Finish extends MainAdmin {

    public Finish(Console console) {
        super(console, "exit");

    }
    public void execute(){
        console.finish();
    }
}