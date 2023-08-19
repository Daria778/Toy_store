package View;

import Presenter.Presenter;

import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private boolean work;
    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
    }

    @Override
    public void start() {
        enterOrRegister();
        }

    public void finish() {
        System.out.println("GoodBye!");
        work = false;
    }
    public void addToy() {

    }
    //TODO добавить возможность войти в уже существующий аккаунт, если такие данные имеются в файловой системе.
    public void enterOrRegister(){
        System.out.println("To purchase a toy, you should enter or register.");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if(presenter.daria(name, surname, password)){
            menu.aAdminMenu();
        }
        else {
            presenter.addHuman(name, surname, password);
            menu.simpleMenu();
        }
    }


}
