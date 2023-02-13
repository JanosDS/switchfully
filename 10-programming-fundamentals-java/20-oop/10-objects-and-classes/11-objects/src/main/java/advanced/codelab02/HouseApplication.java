package advanced.codelab02;

import java.awt.*;

public class HouseApplication {

    /**
     * Do the following
     * ------------------
     * <p>
     * Start by having a quick look at all the different .java files (BigCanvas, BigSquare,...).
     * It's perfectly fine if you see things you don't understand (yet).
     * <p>
     * Then, create a BigWindow object (width 1000 and height 450)
     * Create a BigCanvas object
     * Create Shape objects (BigCircle, BigSquare and BigTriangle) and add them to the BigCanvas object.
     * (3 houses, 1 sun in total: read below)
     * Add the BigCanvas object, as a "component" to the BigWindow object
     * Call the method to launch the BigWindow object.
     * <p>
     * Run the application, we want to see the following:
     * A completely red house on the bottom-left
     * A house with a black roof and a yellow building in the bottom-middle
     * A completely blue house on the bottom-right
     * A yellow sun on the top-right
     * <p>
     * Hint:
     * - Take a look at the house-and-sun.png screenshot for a final result.
     * - A house is made with one BigSquare and one BigTriangle
     * - A sun is made with BigCircle
     * - When a shape is not visible, it might be possible it is drawn outside of the dimensions of the BigCanvas.
     * - E.g. try y-coordinate 360 instead of 450 to make sure the shape is inside of the visible canvas area.
     * - A Color object can be retrieved / created by calling pre-defined constants, such as Color.RED
     * <p>
     * Extra:
     * When you change the dimensions of the BigWindow object, our houses and sun should adapt to this new size.
     * The sun should always be located to the far-left, -right or middle of the window.
     * Hint: use the getWindowsDimensions() method on BigWindow.
     */
    public static void main(String[] args) {
        BigWindow window = new BigWindow(1000, 450);
        BigCanvas canvas = new BigCanvas();

        BigCircle sun = new BigCircle(window.getWindowDimensions().width - 200, window.getWindowDimensions().height - 450, 150, Color.yellow);
        canvas.addShape(sun);

        BigSquare house1 = new BigSquare(0, 350, Color.red);
        BigTriangle roof1 = new BigTriangle(house1.getXCoordinate(), house1.getYCoordinate(), Color.red);
        canvas.addShape(house1);
        canvas.addShape(roof1);

        BigSquare house2 = new BigSquare(window.getWindowDimensions().width / 2, 350, Color.yellow);
        BigTriangle roof2 = new BigTriangle(house2.getXCoordinate(), house2.getYCoordinate(), Color.black);
        canvas.addShape(house2);
        canvas.addShape(roof2);

        BigSquare house3 = new BigSquare(window.getWindowDimensions().width - 100, 350, Color.blue);
        BigTriangle roof3 = new BigTriangle(house3.getXCoordinate(), house3.getYCoordinate(), Color.blue);
        canvas.addShape(house3);
        canvas.addShape(roof3);

        window.addComponent(canvas);
        window.launch();
    }

}
