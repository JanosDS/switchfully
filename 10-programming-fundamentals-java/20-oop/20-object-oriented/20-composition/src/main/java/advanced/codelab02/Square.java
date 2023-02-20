package advanced.codelab02;

public class Square {
    private int multiplier;

    private Tile tile;

    public Square(int multiplier) {
        this.multiplier = multiplier;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public int getPoints() {
        return tile.getPoints() * multiplier;
    }

    @Override
    public String toString() {
        if (tile == null) {
            return "[   ]";
        }
        return "[ " + tile.toString() + " ]";
    }
}
