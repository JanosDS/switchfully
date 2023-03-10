package advanced.codelab03;

import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public class BigSquare extends BigShape {

    private static final int HEIGHT = 50;
    private static final int WIDTH = 50;

    public BigSquare(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    public BigSquare(int xCoordinate, int yCoordinate, Color color) {
        super(xCoordinate, yCoordinate, color);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(this.getXCoordinate(), this.getYCoordinate(), WIDTH, HEIGHT);
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }
}
