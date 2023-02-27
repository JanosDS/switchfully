package advanced.codelab01;

import advanced.codelab01.disc.Disc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DomainTest {

	@Test
	@DisplayName("The given row is within the limits of the field")
	void validateRowTest() {
		Domain domain = new Domain();
		assertTrue(domain.columnIsWithinLimits(5));
		assertTrue(domain.columnIsWithinLimits(1));
		assertTrue(domain.columnIsWithinLimits(6));
		assertFalse(domain.columnIsWithinLimits(0));
		assertFalse(domain.columnIsWithinLimits(7));
	}

	@Test
	@DisplayName("A disc gets added to a column, on an empty field")
	void addDiscToColumn_EmptyFieldTest() {
		Domain domain = new Domain();
		Disc disc = new Disc();
		domain.addDiscOnColumn(disc, 5);
		
	}
}
