package advanced.codelab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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

	private boolean canPlaceShip(Battleship ship, int[] startCoord, boolean horizontal) {
		int[] coord = startCoord;
		for (int i = 0; i < ship.getSize(); i++) {
			int[] coordx_plus1 = {coord[0] + 1, coord[1]};
			int[] coordx_min1 = {coord[0] - 1, coord[1]};
			int[] coordy_plus1 = {coord[0], coord[1] + 1};
			int[] coordy_min1 = {coord[0], coord[1] - 1};
			for (Battleship ship2 : ships) {
				if (ship2.isHit(coord) || ship2.isHit(coordx_min1) || ship2.isHit(coordx_plus1) || ship2.isHit(coordy_min1) || ship2.isHit(coordy_plus1)) {
					System.out.println("Ship overlaps -> retry");
					return false;
				}
				if (coord[0] > 9 || coord[1] > 9) {
					System.out.println("Ship leaves field -> retry");
					return false;
				}
			}
			if (!horizontal) {
				coord[0] += 1;
			} else {
				coord[1] += 1;
			}
		}
		return true;
	}

	private void placeShips() {
		Random r = new Random();

		for (Battleship ship : ships) {
			int[] xy = {r.nextInt(10), r.nextInt(10)};
			boolean horizontal = (r.nextInt(10) < 5);
			do {
				xy[0] = r.nextInt(10);
				xy[1] = r.nextInt(10);
				horizontal = (r.nextInt(10) < 5);
			} while (!canPlaceShip(ship, xy, horizontal));
			System.out.println(ship.getName() + " r:" + xy[0] + " c:" + xy[1] + ", H:" + horizontal);
			ship.setCoordinates(xy, horizontal);
		}
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
			if (ships.get(i).isHit(coord)) {
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
