package Model.Service;

import Model.FileSystem.FileHandler;
import Model.FileSystem.Workable;
import Model.Human.Human;
import Model.Toys.Showcase;
import Model.Toys.Toy;

import java.io.IOException;
import java.util.List;

public class Service {
    private Workable<Object> file;
    private Human h;
    private Showcase showcase;


    public Service() {
        try {
            this.file = new FileHandler<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.showcase = new Showcase();
    }
    public void addHuman(String name, String surname, String password){
        h = new Human(name, surname, password);
        try {
            file.fileWD(h, h.surname + ".txt");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public boolean daria(String name, String surname, String password){
        return name.equals("Daria") & surname.equals("Shkatova") & password.equals("trustNo1");
    }
    public String showToys(){
        return showcase.showToys();
    }
    public void showYourToys(){
        try {
            file.fileR("YourToys.txt");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("There are no toys");
        }
    }

   public void addToy(String name){
        Toy toy = new Toy(name);
        showcase.add(toy);
   }
   public void save(){
       try {
           file.fileWDToys(Showcase.getToys());
           System.out.println("The toys have been added");
       }catch (IOException e){
           throw new RuntimeException(e);
       }
   }
   public void getToy(String name){
        showcase.chooseToy(name);
        String tmp = showcase.get();
       try {
           file.fileWD(tmp, "YourToys.txt");
           System.out.println("You have got a toy!");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void deleteToy(String name){
        showcase.delete(name);
       System.out.println("The toy has been deleted");
   }

}
