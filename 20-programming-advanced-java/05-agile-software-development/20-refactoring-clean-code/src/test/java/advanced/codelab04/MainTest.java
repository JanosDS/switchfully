package advanced.codelab04;

import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;

class MainTest {
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

        String statement = Main.statement(invoice, plays);
        System.out.println(statement);
    }
}
