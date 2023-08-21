package Model.Service;

import Model.FileSystem.FileHandler;
import Model.FileSystem.Workable;
import Model.Human.Human;
import Model.Toys.Showcase;
import Model.Toys.Toy;

import java.io.IOException;

public class Service {
    private Workable file;
    private Human h;
    private Showcase showcase;


    public Service() {
        this.file = new FileHandler<>();
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
        if (name.equals("Daria") & surname.equals("Skatova") & password.equals("trustNo1")){
            return true;
        }
        return false;
    }

   public void addToy(String name){
        Toy toy = new Toy(name);
        showcase.add(toy);
   }
   public void getToy(String name){
        showcase.chooseToy(name);
        Toy tmp = showcase.get();
       try {
           file.fileWD(tmp, "toys.txt");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
   public void deleteToy(String name){
        showcase.delete(name);
   }

}
