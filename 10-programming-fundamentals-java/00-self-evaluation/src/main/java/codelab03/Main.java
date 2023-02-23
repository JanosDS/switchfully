package codelab03;

/**
 * Read the README.md for the assignment
 */
public class Main {
	public static void main(String[] args) {

	}

	public static char[][] createArrayForSize(int size) {
		char[][] array = new char[size][size];

		for (int row = 0; row < size; row++) {
			for (int j = 0; j < size; j++) {
				if (row == 0 || row == size - 1) {
					array[row][j] = '@';
				} else if (j == 0 || j == size - 1) {
					array[row][j] = '@';
				} else {
					array[row][j] = ' ';
				}
			}
		}
		return array;
	}

}
