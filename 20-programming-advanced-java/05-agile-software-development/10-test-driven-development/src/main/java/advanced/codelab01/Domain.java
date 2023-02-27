package advanced.codelab01;

import advanced.codelab01.disc.Disc;

public class Domain {

	private static final int ROWS = 6;
	private static final int COLUMNS = 7;

	private Disc[][] field = new Disc[COLUMNS][ROWS];


	public void addDiscOnColumn(Disc disc, int column) {
		if (columnIsWithinLimits(column)) {
			placeDiscOnField(disc, getEmptyRowOnColumn(column), column - 1);
		}
	}

	private int getEmptyRowOnColumn(int column) {
		for (int row = 0; row < ROWS; row++) {
			if (field[row][column] == null) {
				return row;
			}
		}
		throw new IllegalArgumentException("No free space in this column");
	}

	private void placeDiscOnField(Disc disc, int row, int column) {
		field[row][column] = disc;
	}

	public boolean columnIsWithinLimits(int column) {
		if (0 < column && column <= COLUMNS) {
			return true;
		}
		return false;
	}

}
