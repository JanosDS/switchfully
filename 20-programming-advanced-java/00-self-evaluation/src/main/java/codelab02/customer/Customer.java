package codelab02.customer;

import java.time.LocalDate;

public class Customer {
	private String name;
	private LocalDate birthdate;
	private int age;

	public Customer(String name, LocalDate birthdate, int age) {
		this.name = name;
		this.birthdate = birthdate;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ", " + age + " years old.";
	}
}
