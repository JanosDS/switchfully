package advanced.codelab05;

import org.junit.jupiter.api.Test;

import java.util.List;

class SimpleListTest {

	@Test
	void add_Test() {
		List<String> simpleListStrings = new SimpleList<>();
		simpleListStrings.add("Hello");
		simpleListStrings.add("World");
		String shouldHoldHello = simpleListStrings.get(0);
		int theSizeShouldBe2 = simpleListStrings.size();
	}

}
