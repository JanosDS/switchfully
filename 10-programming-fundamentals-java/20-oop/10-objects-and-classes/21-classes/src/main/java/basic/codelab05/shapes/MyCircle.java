package basic.codelab05.shapes;

import java.lang.Math;

public class MyCircle {
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "blue";
    private double radius;
    private String color;

    public MyCircle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    public MyCircle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "This " + color + " circle has a radius of " + radius + "\n Which means the area is: " + getArea();
    }
}
