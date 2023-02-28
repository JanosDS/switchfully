package advanced.codelab01;

import java.util.Arrays;

public class Zorro {

	public static char[][] generateZ(int size) {
		char[][] zorroChars = new char[size][size];

		Arrays.fill(zorroChars[0], '@'); //fill firstline
		Arrays.fill(zorroChars[size - 1], '@'); //fill last line
		for (int i = 1; i < size - 1; i++) {
			Arrays.fill(zorroChars[i], ' '); // place spaces
			zorroChars[i][size - (i + 1)] = '@';
		}
		return zorroChars;
	}

}
