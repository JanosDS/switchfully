package exercise02.solution01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetCypherTest {
	@Test
	void encode_message_key() {
		String message = "meetmebythetree";
		String key = "scones";
		String expected = "egsgqwtahuiljgs";
		AlphabetCypher cypher = new AlphabetCypher();
		assertEquals(expected, cypher.encodeMessage(message, key));
	}
}