package basic.codelab01;

import java.awt.*;

public class PointRunner {

    /**
     * The goal of this codelab is the gain some insight on Object references.
     * Therefore, don't yet execute the main method!
     * First, do the following:
     * 1. Determine what the printed output will be and why!
     * 2. Draw on a piece of paper which variables (holding references) point to which objects (as we did on the slides)
     * 3. Only then execute the code and validate whether your solutions from step 1 and 2 were correct!
     * - To execute the code, turn the code on line 17 into a comment (or simply remove it)
     */
    public static void main(String[] args) {
        //thinkBeforeYouRunThisExercise();

        Point pointAlpha = new Point(99, 45);
        Point pointBeta = pointAlpha;
        Point pointCharlie = pointBeta;

        pointCharlie.move(45, 205);
        System.out.println(pointAlpha.toString()); // 45/205 -> same object
        System.out.println("----------------------");

        pointBeta = new Point(85, 99);
        System.out.println(pointAlpha.toString()); // 45/205 -> no change
        System.out.println(pointBeta.toString()); // 85/99 -> new point
        System.out.println("----------------------");

        Point pointDelta = Add50(pointAlpha);
        System.out.println(pointDelta); // 95/255 -> Alpha + 50/50
        System.out.println(pointAlpha); // 45/205 -> no change to alpha
        System.out.println("----------------------");

        Point pointEcho = moveTo100(pointAlpha);
        System.out.println(pointCharlie.toString()); // 100/100 -> charlie = beta = alpha = moved to 100/100
        System.out.println(pointEcho.toString()); // 100/100
        System.out.println("----------------------");
    }

    private static Point Add50(Point point) {
        return new Point(point.x + 50, point.y + 50);
    }

    private static Point moveTo100(Point point) {
        point.move(100, 100);
        return point;
    }

    private static void thinkBeforeYouRunThisExercise() {
        throw new RuntimeException("Not so fast. Why don't you think about it first? Then remove the call to this method.");
    }


}
