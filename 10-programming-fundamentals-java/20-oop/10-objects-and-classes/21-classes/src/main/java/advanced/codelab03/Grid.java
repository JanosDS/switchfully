package advanced.codelab03;

import java.util.Arrays;

public class Grid {
    private final int ROWS = 10;
    private final int COLS = 10;
    private Battleship[] ships = new Battleship[5];
    private String[][] grid = new String[10][10];

    public Grid() {
        fillGrid();
        makeShips();
        placeShips();
    }

    private void makeShips() {
        ships[0] = new Battleship("Carrier", new int[5][]);
        ships[1] = new Battleship("Battleship", new int[4][]);
        ships[2] = new Battleship("Destroyer", new int[3][]);
        ships[3] = new Battleship("Submarine", new int[3][]);
        ships[4] = new Battleship("Patrol Boat", new int[2][]);
    }

    private void fillGrid() {
        for (String[] row : grid) {
            Arrays.fill(row, " 0 ");
        }
    }

    private void placeShips() {
        int[] startCoord1 = {0, 0};
        int[] startCoord2 = {0, 0};
        int[] startCoord3 = {0, 0};
        int[] startCoord4 = {0, 0};
        int[] startCoord5 = {0, 0};

        ships[0].setCoordinates(startCoord1, true);
        ships[1].setCoordinates(startCoord2, true);
        ships[2].setCoordinates(startCoord3, true);
        ships[3].setCoordinates(startCoord4, true);
        ships[4].setCoordinates(startCoord5, true);
    }

    public boolean tryHit(int[] coord) {
        for (Battleship ship : ships) {
            if (ship.checkHit(coord)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        // build string - grid to print out
        String printGrid = "";
        for (String[] row : grid) {
            for (String cell : row) {
                printGrid += cell;
            }
            printGrid += "\n";
        }
        printGrid += "---------------------------";
        return printGrid;
    }
}
