package advanced.codelab03;

import java.util.ArrayList;
import java.util.Arrays;

public class Grid {
    private final int ROWS = 10;
    private final int COLS = 10;
    private boolean GAME_OVER = false;
    private ArrayList<Battleship> ships = new ArrayList<>();
    private String[][] grid = new String[10][10];

    public Grid() {
        fillGrid();
        makeShips();
        placeShips();
    }

    private void makeShips() {
        ships.add(new Battleship("Carrier", new int[5][2]));
        ships.add(new Battleship("Battleship", new int[4][2]));
        ships.add(new Battleship("Destroyer", new int[3][2]));
        ships.add(new Battleship("Submarine", new int[3][2]));
        ships.add(new Battleship("Patrol Boat", new int[2][2]));
    }

    private void fillGrid() {
        for (String[] row : grid) {
            Arrays.fill(row, "0");
        }
    }

    private void placeShips() {
        int[] startCoord1 = {0, 0};
        int[] startCoord2 = {2, 0};
        int[] startCoord3 = {4, 0};
        int[] startCoord4 = {6, 0};
        int[] startCoord5 = {9, 0};

        ships.get(0).setCoordinates(startCoord1, true);
        ships.get(1).setCoordinates(startCoord2, true);
        ships.get(2).setCoordinates(startCoord3, true);
        ships.get(3).setCoordinates(startCoord4, true);
        ships.get(4).setCoordinates(startCoord5, true);
    }

    public boolean markGrid(int[] coord) {
        int[] realCoord = translateCoord(coord);
        if (tryHit(realCoord) || grid[realCoord[0]][realCoord[1]].equals("H")) {
            grid[realCoord[0]][realCoord[1]] = "H";
            return true;
        }
        grid[realCoord[0]][realCoord[1]] = "X";
        return false;
    }

    private int[] translateCoord(int[] coord) {
        int[] realCoord = {coord[0] - 1, coord[1] - 1};
        return realCoord;
    }

    public boolean isGAME_OVER() {
        return GAME_OVER;
    }

    public boolean tryHit(int[] coord) {
        for (int i = 0; i < ships.size(); i++) {
            if (ships.get(i).checkHit(coord)) {
                if (ships.get(i).getLives() == 0) {
                    System.out.println(ships.get(i).getName() + " has been sunken!");
                    ships.remove(i);
                    if (ships.size() == 0) {
                        GAME_OVER = true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        // build string - grid to print out
        String printGrid = "";
        printGrid += "---------------------------\n";
        printGrid += "     A  B  C  D  E  F  G  H  I  J \n";
        for (int i = 0; i < grid.length; i++) {
            if ((i + 1) < 10) {
                printGrid += " ";
            }
            printGrid += (i + 1) + ": ";
            for (String cell : grid[i]) {
                printGrid += " " + cell + " ";
            }
            printGrid += "\n";
        }
        printGrid += "---------------------------";
        return printGrid;
    }
}
