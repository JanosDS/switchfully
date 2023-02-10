package advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoopsCodelabs02 {

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     *      catDog("catdog") → true
     *      catDog("catcat") → false
     *      catDog("1cat1cadodog") → true
     * Tip: "cat" and "dog" both have length 3...
     */
    public static boolean catDog(String textToAnalyze) {
        if(textToAnalyze.length() == 0){
            return false;
        }
        int amountCat = counter(textToAnalyze, "cat");
        int amountDog = counter(textToAnalyze, "dog");

        return amountDog == amountCat;
    }

    private static int counter(String toAnalyse, String str){
        Pattern pattern = Pattern.compile(str);
        Matcher strMatcher = pattern.matcher(toAnalyse);
        int count = 0;
        while (strMatcher.find()) {
            count++;
        }
        return count;
    }

}
