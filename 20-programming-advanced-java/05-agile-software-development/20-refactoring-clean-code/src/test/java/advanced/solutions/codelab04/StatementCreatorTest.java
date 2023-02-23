package advanced.solutions.codelab04;

import advanced.solutions.codelab04.input.Invoice;
import advanced.solutions.codelab04.input.Performance;
import advanced.solutions.codelab04.input.Play;
import com.google.common.collect.ImmutableMap;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StatementCreatorTest {
    @Test
    void name() {
        ImmutableMap<String, Play> plays = ImmutableMap.<String, Play>builder()
                .put("hamlet", new Play("Hamlet", "tragedy"))
                .put("as-like", new Play("As You Like It", "comedy"))
                .put("othello", new Play("Othello", "tragedy"))
                .build();

        Invoice invoice = new Invoice("BigCo", new Performance[]{
                new Performance("hamlet", 55),
                new Performance("as-like", 35),
                new Performance("othello", 40),
        });

        String statement = new StatementCreator().createStatement(invoice, plays);
        Assertions.assertThat(statement).isEqualTo("""
                Statement for BigCo
                	Hamlet: $650.00 (55 seats)
                	As You Like It: $580.00 (35 seats)
                	Othello: $500.00 (40 seats)
                Amount owed is $1,730.00
                You earned 47 credits
                """);
    }
}
