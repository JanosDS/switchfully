package basic.codelab03.shapes;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "A triangle with base: " + base + ", height: " + height + " and color: " + super.toString();
    }
}
