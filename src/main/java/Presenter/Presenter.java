package Presenter;

import Model.Service.Service;
import Model.Service.ServiceAdmin;
import Model.Service.ServiceHuman;
import View.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }
//    public void addToy(String name) {
//        serviceAd.addToy();
//    }

   public void addHuman(String name, String surname, String password){
            service.addHuman(name, surname, password);
   }
   public boolean daria(String name, String surname, String password){
        if (service.daria(name, surname, password)){
            return true;
        }
        return false;
   }
}
