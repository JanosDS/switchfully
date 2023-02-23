package basic.solutions.codelab05;

import basic.solutions.codelab05.exception.AddressRequiredException;
import basic.solutions.codelab05.exception.AgeRequirementException;
import basic.solutions.codelab05.exception.FirstNameRequiredException;
import basic.solutions.codelab05.exception.LastNameRequiredException;

public class Person {
    private final int age;
    private final String firstName;
    private final String lastName;
    private final Address address;

    public Person(int age, String firstName, String lastName, Address address) {
        if(age < 18) {
            throw new AgeRequirementException();
        }
        if(firstName == null || firstName.isEmpty()) {
            throw new FirstNameRequiredException();
        }
        if(lastName == null || lastName.isEmpty()) {
            throw new LastNameRequiredException();
        }
        if(address == null) {
            throw new AddressRequiredException();
        }
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }
}
