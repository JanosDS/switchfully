package advanced.solutions.codelab04.play_type;

public class Tragedy implements PlayType {

    @Override
    public double amount(int audience) {
        double thisAmount = 40000;
        if (audience > 30) {
            thisAmount += 1000 * (audience - 30);
        }
        return thisAmount;
    }

    @Override
    public int volumeCredits(int audience) {
        var volumeCredits = 0;
        volumeCredits += Math.max(audience - 30, 0);
        return volumeCredits;
    }
}
