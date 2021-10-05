package app;

public class Car extends Vehicle{

    public Car(String name) {
        super.name=name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getYearOfInvention() { return "1886";}
}
