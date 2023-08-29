package Model.Toys;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    List<Toy> queue;

    public Queue() {
        queue = new ArrayList<>();
    }
    public void add(Toy toy){
        queue.add(toy);
    }
    public String get(){
        Toy tmp = queue.get(0);
        tmp.setNumber();
        return tmp.getName();
    }
}
