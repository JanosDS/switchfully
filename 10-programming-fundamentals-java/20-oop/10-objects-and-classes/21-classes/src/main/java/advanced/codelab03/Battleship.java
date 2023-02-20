package advanced.codelab03;

import java.util.ArrayList;
import java.util.Arrays;

public class Battleship {
	private String name;

	private ArrayList<int[]> cells = new ArrayList<>();
	//private int[][] cells; //cell number, x,y
	private boolean isSunken;

	private int lives;

	public Battleship(String name, int[][] cells) {
		this.name = name;
		this.cells = new ArrayList<>(Arrays.asList(cells));
		this.isSunken = false;
		this.lives = cells.length;
	}

	public String getName() {
		return name;
	}

	public int getLives() {
		return lives;
	}

	public int getSize() {
		return cells.size();
	}

	public void setCoordinates(int[] startCoord, boolean horizontal) {
		int[] coord = startCoord;
		for (int i = 0; i < cells.size(); i++) {
			cells.get(i)[0] = coord[0];
			cells.get(i)[1] = coord[1];
			if (!horizontal) {
				coord[0] += 1;
			} else {
				coord[1] += 1;
			}
		}
	}

	public boolean isHit(int[] coord) {
		for (int[] cell : cells) {
			if (coord[0] == cell[0] && coord[1] == cell[1]) {
				lives--;
				cells.remove(cell);
				return true;
			}
		}
		return false;
	}

}
