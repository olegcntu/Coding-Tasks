package app;

public class Tank extends Vehicle{


    public Tank(String name) {
        super.name=name;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getYearOfInvention() { return "1914"; }
}
