package app;

public class Motorcycle extends Vehicle{

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                '}';
    }

    public Motorcycle(String name) {
        super.name=name;
    }

    @Override
    public String getYearOfInvention() {return "1885"; }
}
