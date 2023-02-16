package basic.codelab01;

import java.awt.*;
import java.util.ArrayList;

public class Shop {

    ArrayList<Car> cars = new ArrayList<>();


    public Shop() {
        addCars();
    }

    public void addCars() {
        cars.add(new Car("1", "Peugeot", Color.white));
        cars.add(new Car("2", "Volkswagen", Color.gray));
        cars.add(new SportsCar("3", "Ferrari", Color.red));
        cars.add(new SportsCar("4", "Porche", Color.yellow));
        cars.add(new SUV("5", "Jeep", Color.green, true));
        cars.add(new SUV("6", "Ddoge", Color.blue, false));
    }

    public Car getCar(String id) {
        return cars.get((Integer.parseInt(id) - 1));
    }
}
