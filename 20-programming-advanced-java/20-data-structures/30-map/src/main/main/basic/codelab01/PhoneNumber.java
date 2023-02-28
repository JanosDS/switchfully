package basic.codelab01;

import java.util.Objects;

public class PhoneNumber {
	private int countryCode;
	private String number;

	public PhoneNumber(int countryCode, String number) {
		this.countryCode = countryCode;
		this.number = number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PhoneNumber that = (PhoneNumber) o;
		return countryCode == that.countryCode && Objects.equals(number, that.number);
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryCode, number);
	}

	public int getCountryCode() {
		return countryCode;
	}

	public String getNumber() {
		return number;
	}
}
