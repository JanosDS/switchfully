package advanced;

public class LoopsCodelabs03 {

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     * there exists a 'y' char somewhere later in the string.
     * So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
     * Return true if the given string is xy-balanced.
     * Attention: if the given String is empty, it is xy-balanced!
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("yaaxbb") → false
     * xyBalance("") → true
     */
    public static boolean xyBalance(String textToAnalyze) {
        boolean balanced = true;
        textToAnalyze.toLowerCase();
        for (int i = 0; i < textToAnalyze.length(); i++) {
            if (textToAnalyze.charAt(i) == 'x') {
                balanced = false;
            } else if (textToAnalyze.charAt(i) == 'y') {
                balanced = true;
            }
        }
        return balanced;
    }

}
