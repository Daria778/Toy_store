package View.Menu.AdminMenu;

import View.Console;

public class DeleteToy extends MainAdmin{
    public DeleteToy(Console console) {
        super(console, "delete toy");

    }
    public void execute(){
        console.deleteToy();
    }
}
