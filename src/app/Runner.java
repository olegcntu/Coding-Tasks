package app;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bicycle("Салют"));
        vehicles.add(new Boat("Стрела"));
        vehicles.add(new Car("BMW"));
        vehicles.add(new Motorcycle("BMWmoto"));
        vehicles.add(new Motorcycle("T-34"));

        for (Vehicle itVehicle:vehicles) {
            System.out.println(itVehicle.move()+". Create: in: "+itVehicle.getYearOfInvention());
        }
    }
}
