package basic.codelab03.shapes;

import basic.codelab03.Color;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "A rectangle with width: " + width + ", length: " + length + " and color: " + super.toString();
    }
}

