package advanced.codelab02;

import java.util.Arrays;

public class ScrabbleBoard {

    private Square[][] squares = new Square[15][15];

    public ScrabbleBoard() {
        for (Square[] row : squares) {
            Arrays.fill(row, new Square(1));
        }
    }

    public Square getSquare(int row, int column) {
        return squares[row][column];
    }

    @Override
    public String toString() {
        String str = "";
        for (Square[] row : squares) {
            for (Square square : row) {
                str += square.toString();
            }
            str += "\n";
        }
        return str;
    }
}
