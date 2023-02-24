package advanced.solutions.codelab04;

import advanced.solutions.codelab04.enrichment.EnrichedInvoice;
import advanced.solutions.codelab04.enrichment.EnrichedInvoiceFactory;
import advanced.solutions.codelab04.enrichment.EnrichedPerformance;
import advanced.solutions.codelab04.enrichment.EnrichedPerformanceFactory;
import advanced.solutions.codelab04.input.Invoice;
import advanced.solutions.codelab04.input.Play;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class StatementCreator {
    public String createStatement(Invoice invoice, Map<String, Play> plays) {
        return printStatement(new EnrichedInvoiceFactory(new EnrichedPerformanceFactory(plays)).createEnrichedInvoice(invoice));
    }

    private String printStatement(EnrichedInvoice invoice) {
        var result = "Statement for " + invoice.customer() + "\n";
        for(EnrichedPerformance performance: invoice.getPerformances()) {
            result += "\t" + performance.playName() + ": " + usd(performance.amount() / 100.0) + " (" + performance.audience() + " seats)\n";
        }
        result += "Amount owed is " + usd(invoice.totalAmount() /100.0) +"\n";
        result += "You earned " + invoice.totalVolumeCredits() + " credits\n";
        return result;
    }

    public String usd(double amount) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(amount);
    }

}
