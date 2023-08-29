package Model.Service;

import Model.FileSystem.FileHandler;
import Model.FileSystem.Workable;
import Model.Human.Human;
import Model.Toys.Queue;
import Model.Toys.Showcase;
import Model.Toys.Toy;

import java.io.IOException;



public class Service {
    private Workable<Object> file;
    private Human h;
    private Queue queue;
    private Showcase showcase;



    public Service() {
        this.file = new FileHandler<>();
        this.showcase = new Showcase();
        this.queue = new Queue();

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
        try{
            showcase = file.fileRToys();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
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
           file.fileWDToys(showcase);
           System.out.println("The toys have been added");
       }catch (IOException e){
           throw new RuntimeException(e);
       }
   }
    public Toy chooseToy(String name){
        Toy toy = null;
        for (Toy l:showcase.getToys()) {
            if (l.getName().equals(name) & l.getNumber() > 0){
                toy = l;
            }
        }
        if (toy != null){
            return toy;
        }
        throw new RuntimeException("There is no such a toy");
    }
   public void getToy(){
        String tmp = queue.get();
       try {
           file.fileWD(tmp, "YourToys.txt");
           System.out.println("You have got a toy!");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       queue.delete();
   }
   public void deleteToy(String name){
        showcase.delete(name);
       System.out.println("The toy has been deleted");
   }

}
