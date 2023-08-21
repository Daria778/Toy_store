package Model.Toys;


public class Toy {

private int id;
private String name;
private int number;
private int rate;
private Showcase toys;



    public Toy(String name) {
        toys = new Showcase();
        this.id = toys.getToysSize()+1;
        this.name = name;
        this.rate = rand(100);
        this.number = rand(10);
    }

    public int getNumber() {
        if (number > 0){
            return number-1;
        }
        return 0;
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
        return id + " " + name + " " + rate + "%" + ", " +  "there are/is" + number + "toys";

    }
}
