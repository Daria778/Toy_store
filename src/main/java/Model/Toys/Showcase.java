package Model.Toys;

import Model.FileSystem.Workable;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Showcase implements Serializable {
     static List<Toy> toys;
     List<Toy> queue;
     Workable<List<Toy>> file;


    public Showcase() {
        try{
         toys = (List<Toy>) file.fileRToys();
        }catch (NullPointerException | IOException | ClassNotFoundException e){
            toys = new ArrayList<>();
        }
        queue = new ArrayList<>();
    }

    public static List<Toy> getToys() {
        return toys;
    }

    public void add(Toy toy){
        toys.add(toy);

    }
    public void chooseToy(String name){
        for (Toy l:toys) {
            if (l.getName().equals(name) & l.getNumber() > 0){
                    queue.add(l);
                }
            else {
                System.out.println("There is no such a toy");
            }
            }
    }

    public String get(){
        Toy tmp = queue.get(0);
        tmp.setNumber();
        return tmp.getName();
    }
    public void delete(String name){
        if (!toys.removeIf(t -> t.getName().equals(name))){
            System.out.println("There is no such a toy");
        }
    }
    public String showToys() {
        StringBuilder lol = new StringBuilder();
        if (toys.isEmpty()){
            lol.append("There are no toys");
        }
        else{
            lol.append("There are toys:\n");
            for (Toy toy : toys) {
                lol.append(toy);
                lol.append("\n");
            }

        }
        return lol.toString();
    }



}
