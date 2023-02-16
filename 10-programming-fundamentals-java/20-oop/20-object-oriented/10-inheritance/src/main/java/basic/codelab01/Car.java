package basic.codelab01;

import java.awt.*;
import java.util.Objects;

public class Car {
    private String identifier;
    private String model;
    private Color color;

    public Car(String id, String model, Color color) {
        this.identifier = id;
        this.model = model;
        this.color = color;
    }

    public String getHorsepower() {
        return "120hp";
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public void turnOnEngine() {
        System.out.println("Vroom vroom");
    }

    @Override
    public String toString() {
        return model + " id: " + identifier + "- color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(identifier, car.identifier) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, model, color);
    }
}
