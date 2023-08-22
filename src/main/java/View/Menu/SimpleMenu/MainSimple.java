package View.Menu.SimpleMenu;

import View.Console;

public abstract class MainSimple {
    Console console;
    private String description;

    public MainSimple(Console console, String description) {
        this.console = console;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public abstract void execute();
}
