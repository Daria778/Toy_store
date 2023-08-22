package View.Menu.SimpleMenu;
import View.Console;


public class GetToy extends MainSimple {

    public GetToy(Console console) {
        super(console, "get toy");

    }
    public void execute(){
        console.getToy();
    }
}
