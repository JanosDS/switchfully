package basic.codelab01;

import java.awt.*;

public class SUV extends Car {

    private boolean is4WheelDrive;

    public SUV(String id, String model, Color color, boolean has4x4) {
        super(id, model, color);
        this.is4WheelDrive = has4x4;
    }

    @Override
    public String getHorsepower() {
        return "200hp";
    }

    @Override
    public String toString() {
        return super.toString() + " has 4x4: " + is4WheelDrive;
    }
}
