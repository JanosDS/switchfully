package basic;

public class DecisionMakingCodelab04 {

    public static void main(String[] args) {
        System.out.println(playBlackjack(18, 19));
    }

    /**
     * Given 2 int values greater than 0,
     * return whichever value is nearest to 21 without going over.
     * Return 0 if they both go over.
     *      playBlackjack(19, 21) → 21
     *      playBlackjack(21, 19) → 21
     *      playBlackjack(19, 22) → 19
     */
    public static int playBlackjack(int cardValue1, int cardValue2) {
        if(cardValue1 > 21 && cardValue2 > 21){
            return 0;
        }
        else if(cardValue1 > 21){
            return cardValue2;
        }
        else if(cardValue2 > 21){
            return cardValue1;
        }
        else{
            return Math.max(cardValue1, cardValue2);
        }
    }



}
