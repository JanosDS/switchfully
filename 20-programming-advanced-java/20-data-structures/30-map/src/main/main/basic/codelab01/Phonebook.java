package basic.codelab01;

import java.util.HashMap;

public class Phonebook {

	HashMap<Name, PhoneNumber> phonebook = new HashMap<>();

	public void addPhoneNumberForName(PhoneNumber phoneNumber, Name name) {
		phonebook.put(name, phoneNumber);
	}

	public PhoneNumber getNumberByName(Name name) {
		return phonebook.get(name);
	}

	public HashMap<Name, PhoneNumber> getPhonebook() {
		return phonebook;
	}

	public void removePhoneNumberByName(Name name) {
		phonebook.remove(name);
	}

	public void updateNumberForName(PhoneNumber newNumber, Name name) {
		phonebook.replace(name, newNumber);
	}

	public String getAllEntriesInPhonebook() {
		StringBuilder strb = new StringBuilder();
		phonebook.forEach((name, number) -> {
			strb.append("\n" + name.getFirstName() + " " + name.getLastName() + " - " + number.getCountryCode() + number.getNumber());
		});
		return strb.toString();
	}

}
