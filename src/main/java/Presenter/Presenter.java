package Presenter;

import Model.Service.Service;
import View.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }
    public void addToy(String name) {
        service.addToy(name);
    }
    public void getToy(String name){
        service.getToy(name);
    }
    public void deleteToy(String name){
        service.deleteToy(name);
    }

   public void addHuman(String name, String surname, String password){
            service.addHuman(name, surname, password);
   }
   public String showToys(){
        return service.showToys();
   }
   public boolean daria(String name, String surname, String password){
        if (service.daria(name, surname, password)){
            return true;
        }
        return false;
   }

}
