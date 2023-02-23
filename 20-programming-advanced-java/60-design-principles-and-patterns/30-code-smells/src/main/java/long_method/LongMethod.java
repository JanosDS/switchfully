package long_method;

public class LongMethod {

    final static String X_WIN_TXT = "Player X has won the game.";
    final static String O_WIN_TXT = "Player O has won the game.";
    final static String NO_WIN_TXT = "No one has won the game.";
    final static char X_PLAYER = 'X';
    final static char O_PLAYER = 'O';
    final static char NO_PLAYER = ' ';

    private static char getWinnerByDiagonalSimpleOrInvertedSimpleIsDefault(char[][] chars2D, boolean isSimple) {
        char winner = NO_PLAYER;
        char currentChar = NO_PLAYER;
        int currentCharCount = 0;
        int size = chars2D.length;

        for(int row = 0; row < size; row++) {
            int col = isSimple ? row : size-(row+1);
            char c = chars2D[row][col];
            if(currentChar == c) {
                currentCharCount++;
                continue;
            }
            if(currentChar != NO_PLAYER && currentCharCount >= 3) {
                winner = currentChar;
                break;
            }
            currentChar = c;
            currentCharCount = 1;
        }
        if(currentChar != NO_PLAYER && currentCharCount >= 3) {
            winner = currentChar;
        }
        return winner;
    }
}
