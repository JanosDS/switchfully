package basic.codelab02;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
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
        return "Base: " + base + ", height: " + height + ", color: " + super.toString();
    }
}
