package Model.Toys;

public class Toy {

private int id;
private String name;

private int rate;

    public Toy(int id, String name, int rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + rate + "%";

    }
}
