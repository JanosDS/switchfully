package advanced.codelab02;

public class TicTacToe {

	public static void checkWin(char[][] chars) {
		if (checkHorizontal(chars) != '\0') {
			System.out.println("Player " + checkHorizontal(chars) + " has won the game.");
		} else if (checkVertical(chars) != '\0') {
			System.out.println("Player " + checkVertical(chars) + " has won the game.");
		} else if (checkDiagonal(chars) != '\0') {
			System.out.println("Player " + checkDiagonal(chars) + " has won the game.");
		} else {
			System.out.println("No one has won the game.");
		}
	}

	public static char checkHorizontal(char[][] chars) {
		for (char[] row : chars) {
			if (isThreeInARow(row)) {
				return row[0];
			}
		}
		return '\0';
	}

	public static char checkVertical(char[][] chars) {
		for (int i = 0; i < 3; i++) {
			char[] column = {chars[0][i], chars[1][i], chars[2][i]};
			if (isThreeInARow(column)) {
				return column[0];
			}
		}
		return '\0';
	}

	public static char checkDiagonal(char[][] chars) {
		char[] diagonal1 = {chars[0][0], chars[1][1], chars[2][2]};
		char[] diagonal2 = {chars[0][2], chars[1][1], chars[2][0]};
		if (isThreeInARow(diagonal1) || isThreeInARow(diagonal2)) {
			return chars[2][2];
		}
		return '\0';
	}

	public static boolean isThreeInARow(char[] chars) {
		for (int i = 1; i < chars.length; i++) {
			if (chars[0] != chars[i]) {
				return false;
			}
		}
		return true;
	}

}
