package basic.codelab02;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(50, 50), new Triangle(20, 30)};

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
        }
    }
}
