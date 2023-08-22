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
    public void showToys(){
        System.out.println(presenter.showToys());
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

    public void enterOrRegister(){
        System.out.println("To purchase a toy, you should enter or register.");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if(presenter.daria(name, surname, password)){
            System.out.println("You have been entered as Admin");
            while(work){
                System.out.println(admin.menu());
                String option = scanner.nextLine();
                int numOp = Integer.parseInt(option);
                admin.execute(numOp);
            }
        }
        else {
            presenter.addHuman(name, surname, password);
            System.out.println("You have been entered as guest");
            while(work){
                System.out.println(simple.menu());
                String option = scanner.nextLine();
                int numOp = Integer.parseInt(option);
                simple.execute(numOp);
            }
        }
    }


}
