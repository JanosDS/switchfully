package basic.codelab02;

public class Shape {
    private Color color;

    public Shape() {
        this(Color.RED);
    }

    public Shape(Color color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }


    @Override
    public String toString() {
        return color.getValue();
    }
}
