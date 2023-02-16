package basic.codelab01;

import java.awt.*;

public class SportsCar extends Car {

    public SportsCar(String id, String model, Color color) {
        super(id, model, color);
    }

    @Override
    public String getHorsepower() {
        return "350hp";
    }

    @Override
    public void turnOnEngine() {
        System.out.println("Brabrabrabraaa");
    }
}
