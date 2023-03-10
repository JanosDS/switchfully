package basic.codelab03.shapes;

import basic.codelab03.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
        this(Color.RED);
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return color.getValue();
    }
}
