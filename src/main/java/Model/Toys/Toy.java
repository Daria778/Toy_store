package Model.Toys;


import java.io.Serializable;

public class Toy implements Serializable {
private String name;
private int number;
private int rate;





    public Toy(String name) {
        this.name = name;
        this.rate = rand(100);
        this.number = rand(10);
    }

    public void setNumber() {
        this.number = this.number - 1;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static int rand(int max)
    {
        return (int) (Math.random() * ++max);
    }

    @Override
    public String toString() {
        return name + " " + rate + "%, " + "there are/is " + number + " toys";

    }
}
