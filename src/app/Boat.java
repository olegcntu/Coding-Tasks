package app;

public class Boat extends Vehicle{
    @Override
    public String getYearOfInvention() {return "1905";}

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Boat(String name) {
        super.name=name;
    }
}
