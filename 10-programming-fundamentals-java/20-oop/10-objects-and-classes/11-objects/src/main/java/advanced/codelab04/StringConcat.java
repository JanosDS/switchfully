package advanced.codelab04;

import java.util.StringJoiner;

public class StringConcat {

    public static void main(String[] args) {
        String[] lorem = {"Lorem", "ipsum", "dolor", "sit", "amet"};
        System.out.println(joinLorem(lorem));
        System.out.println(buildLorem(lorem));
    }

    /**
     * Implement the joinLorem method to make the test succeed.
     * Hints: Look up information on StringJoiner, then create an object and use it.
     */
    static String joinLorem(String[] wordsToJoin) {
        StringJoiner strj = new StringJoiner(" ");
        for (String word : wordsToJoin) {
            strj.add(word);
        }
        return strj.toString();
    }

    /**
     * Implement the buildLorem method to make the test succeed.
     * Hints: Look up information on StringBuilder, then create an object and use it.
     */
    static String buildLorem(String[] wordsToBuild) {


        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < wordsToBuild.length; i++) {
            strb.append(wordsToBuild[i]);
            if (i < wordsToBuild.length - 1) {
                strb.append(" ");
            }
        }
        return strb.toString();
    }

}
