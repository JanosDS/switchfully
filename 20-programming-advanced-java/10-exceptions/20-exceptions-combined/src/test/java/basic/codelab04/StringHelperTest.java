package basic.codelab04;

import basic.codelab03.MyOwnLocalDate;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringHelperTest {

	@Test
	void repeatArrayTest_posInt() {
		String[] stringArray = {"Ha", "Ho"};
		String expected = "HaHaHoHo";
		String result = StringHelper.repeatArray(stringArray, 2);
		assertEquals(expected, result);
	}

	@Test
	void repeatArrayTest_negInt() {
		StringHelper stringHelper = new StringHelper();
		String[] stringArray = {"Ha", "Ho"};
		String expected = "HaHaHoHo";

		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () ->
				StringHelper.repeatArray(stringArray, -1)
		);

	}
}
