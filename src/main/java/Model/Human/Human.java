package Model.Human;

public class Human {
    String name;
    public String surname;
    String password;

    public Human(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + password;
    }
}
