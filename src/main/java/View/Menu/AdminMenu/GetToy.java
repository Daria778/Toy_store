package View.Menu.AdminMenu;
import View.Console;

public class GetToy extends MainAdmin {

    public GetToy(Console console) {
        super(console, "get toy");

    }
    public void execute(){
        console.getToy();
    }
}
