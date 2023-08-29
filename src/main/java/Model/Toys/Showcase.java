package Model.Toys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Showcase implements Serializable {
     public  List<Toy> toys;



    public Showcase() {
         toys = new ArrayList<>();
    }

    public  List<Toy> getToys() {
        return toys;
    }
    public int size(){
        return toys.size();
    }
    public Object get(int i){
        return toys.get(i);
    }

    public void add(Toy toy){
        toys.add(toy);
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
            for (int i = 0; i < toys.size(); i++) {
                lol.append(i);
                lol.append(". ");
                lol.append(toys.get(i));
                lol.append("\n");
            }

        }
        return lol.toString();
    }
}
