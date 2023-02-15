package advanced.codelab03;

public class Battleship {
    private String name;
    private int[][] cells; //cell number, x,y

    private boolean isSunken;

    public Battleship(String name, int[][] cells) {
        this.name = name;
        this.cells = cells;
        this.isSunken = false;
    }

    public void setCoordinates(int[] startCoord, boolean horizontal) {
        int[] coord = startCoord;
        for (int[] cell : cells) {
            cell = coord;
            if (horizontal) {
                coord[0] += 1;
            } else {
                coord[1] += 1;
            }
        }
    }

    public boolean checkHit(int[] coord) {
        for (int[] cell : cells) {
            if (coord == cell) {
                return true;
            }
        }
        return false;
    }


}
