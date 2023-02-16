package advanced.codelab03;

public class Battleship {
    private String name;
    private int[][] cells; //cell number, x,y
    private boolean isSunken;

    private int lives;

    public Battleship(String name, int[][] cells) {
        this.name = name;
        this.cells = cells;
        this.isSunken = false;
        this.lives = cells.length;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public void setCoordinates(int[] startCoord, boolean horizontal) {
        int[] coord = startCoord;
        for (int i = 0; i < cells.length; i++) {
            cells[i][0] = coord[0];
            cells[i][1] = coord[1];
            if (!horizontal) {
                coord[0] += 1;
            } else {
                coord[1] += 1;
            }
        }
    }

    public boolean checkHit(int[] coord) {
        for (int[] cell : cells) {
            if (coord[0] == cell[0] && coord[1] == cell[1]) {
                lives--;
                return true;
            }
        }
        return false;
    }


}
