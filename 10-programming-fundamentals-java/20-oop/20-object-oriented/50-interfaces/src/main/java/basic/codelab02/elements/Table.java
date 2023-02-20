package basic.codelab02.elements;

import basic.codelab02.Downloadable;

import java.util.Arrays;

public class Table implements Downloadable {

	private final int rows;
	private final int columns;
	private final String[][] cells;

	public Table(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		cells = new String[rows][columns];
	}

	public void insertInCell(int row, int column, String cellData) {
		cells[row][column] = cellData;
	}

	@Override
	public String download() {
		return "You wouldn't download a car, so why a table? Want some chairs?";
	}

	@Override
	public String toString() {
		return "Table{" +
				"rows=" + rows +
				", columns=" + columns +
				", cells=" + Arrays.toString(cells) +
				'}';
	}
}
