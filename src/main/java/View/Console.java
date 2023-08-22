package View;

import Presenter.Presenter;
import View.Menu.AdminMenu.AdminMenu;
import View.Menu.AdminMenu.MainAdmin;
import View.Menu.SimpleMenu.MainSimple;
import View.Menu.SimpleMenu.SimpleMenu;

import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private boolean work;
    private Scanner scanner;
    private AdminMenu admin;
    private SimpleMenu simple;

    public Console() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
        this.admin = new AdminMenu(this);
        this.simple = new SimpleMenu(this);
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
        System.out.println("Enter the name of the toy:");
        String ans = scanner.nextLine();
        presenter.addToy(ans);
    }
    public void getToy(){
        System.out.println("Enter the name of the toy, you want to receive:");
        String ans = scanner.nextLine();
        presenter.getToy(ans);
    }
    public void deleteToy(){
        System.out.println("Enter the name of the toy, you want to delete:");
        String ans = scanner.nextLine();
        presenter.deleteToy(ans);
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
            admin.menu();
        }
        else {
            presenter.addHuman(name, surname, password);
            simple.menu();
        }
    }


}
