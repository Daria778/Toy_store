package View.Menu.AdminMenu;

import View.Console;

public abstract class MainAdmin {
    Console console;
    private String description;

    public MainAdmin(Console console, String description) {
        this.console = console;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public abstract void execute();
}
