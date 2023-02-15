package basic.codelab02;

public class MyRectangle {
    public static int instanceCount = 0;
    private String label;
    private int width;
    private int height;
    private int xCoordinate;
    private int yCoordinate;

    public MyRectangle() {
        this(50, 100);
    }

    public MyRectangle(int width, int height) {
        this(5, 10, width, height);
    }

    public MyRectangle(int xCoord, int yCoord, int width, int height) {
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoord;
        this.yCoordinate = yCoord;
        instanceCount++;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public static MyRectangle duplicate(MyRectangle rectangle) {
        MyRectangle newRectangle = new MyRectangle(rectangle.getWidth(), rectangle.getHeight(), rectangle.getXCoordinate(), rectangle.getYCoordinate());
        return newRectangle;
    }
}
