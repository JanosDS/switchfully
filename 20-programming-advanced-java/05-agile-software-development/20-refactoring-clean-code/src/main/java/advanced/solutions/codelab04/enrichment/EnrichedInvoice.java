package advanced.solutions.codelab04.enrichment;

import java.util.Arrays;

public class EnrichedInvoice {

    private String customer;
    private EnrichedPerformance[] performances;

    public EnrichedInvoice(String customer, EnrichedPerformance[] performances) {
        this.customer = customer;
        this.performances = performances;
    }

    public String customer() {
        return customer;
    }

    public EnrichedPerformance[] getPerformances() {
        return performances;
    }

    public int totalVolumeCredits() {
        return Arrays.stream(getPerformances()).mapToInt(EnrichedPerformance::volumeCredits).sum();
    }

    public double totalAmount() {
        return Arrays.stream(getPerformances()).mapToDouble(EnrichedPerformance::amount).sum();
    }
}
