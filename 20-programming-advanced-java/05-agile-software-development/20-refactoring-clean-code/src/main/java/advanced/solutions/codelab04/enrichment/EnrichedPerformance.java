package advanced.solutions.codelab04.enrichment;

import advanced.solutions.codelab04.play_type.Comedy;
import advanced.solutions.codelab04.play_type.PlayType;
import advanced.solutions.codelab04.play_type.Tragedy;

public class EnrichedPerformance {

    private String playName;
    private int audience;
    private PlayType playType;

    public EnrichedPerformance(String playName, int audience, String playType) {
        this.playName = playName;
        this.audience = audience;
        this.playType = toPlayType(playType);
    }

    private PlayType toPlayType(String performanceType) {
        return switch (performanceType) {
            case "tragedy" -> new Tragedy();
            case "comedy" -> new Comedy();
            default -> throw new RuntimeException();
        };
    }

    public String playName() {
        return playName;
    }

    public double amount() {
        return playType.amount(audience);
    }

    public int audience() {
        return audience;
    }

    public int volumeCredits() {
        return playType.volumeCredits(audience);
    }
}
