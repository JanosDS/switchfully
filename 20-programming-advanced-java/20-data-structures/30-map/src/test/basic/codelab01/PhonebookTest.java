package test.basic.codelab01;

import basic.codelab01.Name;
import basic.codelab01.PhoneNumber;
import basic.codelab01.Phonebook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {

	@Test
	void addPhonenumberToPhonebookTest() {
		Name name = new Name("Fredje", "Friet");
		PhoneNumber number = new PhoneNumber(32, "495188557");
		Phonebook book = new Phonebook();

		book.addPhoneNumberForName(number, name);
		assertEquals(true, number.equals(book.getNumberByName(name)));
	}

	@Test
	void removePhonenumberFromPhonebookTest() {
		Name name = new Name("Fredje", "Friet");
		PhoneNumber number = new PhoneNumber(32, "495188557");
		Phonebook book = new Phonebook();
		book.addPhoneNumberForName(number, name);
		book.removePhoneNumberByName(name);
		assertEquals(false, book.getPhonebook().containsKey(name));
	}

	@Test
	void updatePhonenumberInPhonebookForNameTest() {
		Name name = new Name("Fredje", "Friet");
		PhoneNumber number = new PhoneNumber(32, "495188557");
		Phonebook book = new Phonebook();
		book.addPhoneNumberForName(number, name);
		PhoneNumber newNumber = new PhoneNumber(35, "454894455445");
		book.updateNumberForName(newNumber, name);
		assertEquals(true, newNumber.equals(book.getNumberByName(name)));
	}

	@Test
	void getAllEntriesFronPhonebookTest() {
		Name name = new Name("Fredje", "Friet");
		PhoneNumber number = new PhoneNumber(32, "495188557");
		Phonebook book = new Phonebook();
		book.addPhoneNumberForName(number, name);

		String expected = "\n" + name.getFirstName() + " " + name.getLastName() + " - " + number.getCountryCode() + number.getNumber();
		assertEquals(true, expected.equals(book.getAllEntriesInPhonebook()));
	}
}
