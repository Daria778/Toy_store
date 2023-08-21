package Model.Toys;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Showcase {
    private List<Toy> toys;
    private List<Toy> queue;


    public Showcase() {
        toys = new ArrayList<>();
        queue = new ArrayList<>();
    }

    public void add(Toy toy){
        toys.add(toy);
    }
    public void chooseToy(String name){
        for (Toy l:toys) {
            if (l.getName().equals(name)){
                    queue.add(l);
                }
            }
    }

    public Toy get(){
        Toy tmp = queue.get(0);
        tmp.getNumber();
        return tmp;
    }
    public void delete(String name){
        for (Toy t:toys) {
            if (t.getName().equals(name)){
                toys.remove(t);
            }
        }
    }

    public int getToysSize() {
        return toys.size();
    }
}
