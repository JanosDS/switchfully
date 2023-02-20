package basic.codelab02;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
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
        return "Width: " + width + ", length: " + length + ", color: " + super.toString();
    }
}
