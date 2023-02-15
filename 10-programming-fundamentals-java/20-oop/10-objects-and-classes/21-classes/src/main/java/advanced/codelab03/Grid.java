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
    }

    private void makeShips() {
        ships[0] = new Battleship("Carrier", 5, new int[2]);
        ships[1] = new Battleship("Battleship", 4, new int[2]);
        ships[2] = new Battleship("Destroyer", 3, new int[2]);
        ships[3] = new Battleship("Submarine", 3, new int[2]);
        ships[4] = new Battleship("Patrol Boat", 2, new int[2]);
    }

    private void fillGrid() {
        for (String[] row : grid) {
            Arrays.fill(row, " 0 ");
        }
    }

    private void placeShips() {
        for (Battleship ship : ships) {
            // gen and validate startxy and direction

        }
    }

    public boolean tryHit(int x, int y) {

        grid[x][y] = " X ";
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
        return printGrid;
    }
}
