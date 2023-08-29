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
        if (queue.isEmpty()){
            System.out.println("There are no such a toy");
        }
        else{
            Toy tmp = queue.get(0);
            tmp.setNumber();
            return tmp.getName();
        }
        return "false";
    }
    public void delete(){
        queue.remove(0);
    }
}
