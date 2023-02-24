package advanced.solutions.codelab04.play_type;

public class Comedy implements PlayType {

    @Override
    public double amount(int audience) {
        double thisAmount = 30000;
        if (audience > 20) {
            thisAmount += 10000 + 500 * (audience - 20);
        }
        thisAmount += 300 * audience;
        return thisAmount;
    }

    @Override
    public int volumeCredits(int audience) {
        var volumeCredits = 0;
        volumeCredits += Math.max(audience - 30, 0);
        volumeCredits += Math.floor(audience / 5.0);
        return volumeCredits;
    }
}
