package View.Menu.AdminMenu;


import View.Console;

public class AddToy extends MainAdmin {

    public AddToy(Console console) {
        super(console, "add toy");

    }
    public void execute(){
        console.addToy();
    }
}