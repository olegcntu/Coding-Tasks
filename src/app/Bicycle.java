package app;

public class Bicycle extends Vehicle{

    @Override
    public String getYearOfInvention() {
        return "1817";
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bicycle(String name) {
        super.name=name;
    }
}
