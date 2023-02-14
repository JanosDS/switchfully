package advanced.codelab03;

import advanced.codelab03.BigCanvas;
import advanced.codelab03.BigSquare;
import advanced.codelab03.BigWindow;

import java.awt.*;

public class CheckerboardLauncher {

    /**
     * This is a completely optional codelab.
     * (But it's a fun one though...)
     * <p>
     * ------------------
     * Do the following
     * ------------------
     * <p>
     * Create a checkerboard (black and red tiles) using BigWindow, BigCanvas and BigSquare.
     * The checkerboard should dynamically generate tiles based on the BigWindow's dimensions.
     * Feel free to create extra (helper) methods if you feel they will help you write
     * cleaner / better / simpler code.
     */
    public static void main(String[] args) {
        int squareSize = 50;

        BigWindow window = new BigWindow(400, 400);
        BigCanvas canvas = new BigCanvas();

        int x = 0;
        int y = 0;
        while (y < window.getWindowDimensions().height) {
            while (x < window.getWindowDimensions().width) {
                BigSquare square = new BigSquare(x, y);
                if (((x + y) / squareSize) % 2 == 0) {
                    square.setColor(Color.red);
                } else {
                    square.setColor(Color.yellow);
                }
                canvas.addShape(square);
                x += squareSize;
            }
            x = 0;
            y += squareSize;
        }


        window.addComponent(canvas);
        window.launch();

    }


}
