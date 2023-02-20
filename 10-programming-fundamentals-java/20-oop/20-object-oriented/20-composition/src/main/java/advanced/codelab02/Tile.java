package advanced.codelab02;

import java.util.Objects;

public class Tile {
    private int points;
    private Character letter;

    public Tile(int points, Character letter) {
        this.points = points;
        this.letter = letter;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return letter.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return points == tile.points && Objects.equals(letter, tile.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points, letter);
    }
}
