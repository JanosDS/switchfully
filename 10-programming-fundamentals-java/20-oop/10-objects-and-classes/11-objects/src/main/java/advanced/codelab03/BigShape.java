package advanced.codelab03;

import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public abstract class BigShape {

    private int xCoordinate;
    private int yCoordinate;
    private Color color;

    public BigShape(int xCoordinate, int yCoordinate, Color color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }

    public BigShape(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    abstract void draw(Graphics g);

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
