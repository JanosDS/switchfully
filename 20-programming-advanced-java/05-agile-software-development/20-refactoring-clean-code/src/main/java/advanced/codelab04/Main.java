package advanced.codelab04;

import com.google.common.collect.ImmutableMap;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static String statement(Invoice invoice, Map<String, Play> plays) {
        var totalAmount = 0.0;
        var volumeCredits = 0;
        var result = "Statement for " + invoice.customer() + "\n";
        final var format = NumberFormat.getCurrencyInstance(Locale.US);
        for(Performance perf: invoice.performances()) {
            var play = plays.get(perf.playId());
            var thisAmount = 0;

            switch (play.type()) {
                case "tragedy":
                    thisAmount = 40000;
                    if (perf.audience() > 30) {
                        thisAmount += 1000 * (perf.audience() - 30);
                    }
                    break;
                case "comedy":
                    thisAmount = 30000;
                    if (perf.audience() > 20) {
                        thisAmount += 10000 + 500 * (perf.audience() - 20);
                    }
                    thisAmount += 300 * perf.audience();
                    break;
                default:
                    throw new RuntimeException("unkown type: " + play.type());
            }

            //add volume credits
            volumeCredits += Math.max(perf.audience() - 30, 0);
            //add extra credit for every ten comedy attendees
            if (play.type().equals("comedy")) volumeCredits += Math.floor(perf.audience() / 5.0);


            //print line for this order
            result += "\t" + play.name() + ": " + format.format(thisAmount / 100.0) + " (" + perf.audience() + " seats)\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + format.format(totalAmount/100.0) +"\n";
        result += "You earned " + volumeCredits + " credits\n";
        return result;
    }
}
