package advanced.codelab01;

import java.awt.*;

public class ApplicationRunner {

    /**
     * Do the following
     * ------------------
     * Create a LittleRectangle object,
     * provide it the following coordinates and color:
     * x: 10
     * y: 35
     * color: red
     * Create a LittleWindow object.
     * Add the LittleRectangle object, as a "component", to the LittleWindow object by calling the correct method.
     * Call the method to launch the LittleWindow object.
     * Run this Java application, a window should open containing a red rectangle.
     */
    public static void main(String[] args) {

        LittleRectangle rectangle = new LittleRectangle(10, 35, Color.red);
        LittleWindow window = new LittleWindow();
        window.addComponent(rectangle);
        window.launch();

    }

}
