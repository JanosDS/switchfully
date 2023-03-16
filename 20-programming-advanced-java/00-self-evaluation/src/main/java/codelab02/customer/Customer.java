package codelab02.customer;

import java.time.LocalDate;

public class Customer {
	private String name;
	private LocalDate birthdate;

	public Customer(String name, LocalDate birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public int getAge() {
		return LocalDate.now().getYear() - birthdate.getYear();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ", " + getAge() + " years old.";
	}
}
