package basic.codelab03;

import basic.codelab03.shapes.Rectangle;
import basic.codelab03.shapes.Shape;
import basic.codelab03.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(20, 20),
                new Triangle(5, 15),
                new Rectangle(15, 12),
                new Triangle(77, 0.5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
        }
    }
}
