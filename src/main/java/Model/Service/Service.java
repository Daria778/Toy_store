package Model.Service;

import Model.FileSystem.FileHandler;
import Model.FileSystem.Workable;
import Model.Human.Human;

import java.io.IOException;

public class Service {
    private Workable file;
    private Human h;
    private ServiceAdmin serviceAdmin;
    private ServiceHuman serviceHuman;
    public Service() {
        this.file = new FileHandler();
        this.serviceAdmin = new ServiceAdmin();
        this.serviceHuman = new ServiceHuman();
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

   public void addToy(){
        serviceAdmin.addToy();
   }
   public void getToy(){
        serviceHuman.getToy();
   }

}
