package basic.solutions.codelab05;

import basic.solutions.codelab05.exception.AddressRequiredException;
import basic.solutions.codelab05.exception.AgeRequirementException;
import basic.solutions.codelab05.exception.FirstNameRequiredException;
import basic.solutions.codelab05.exception.LastNameRequiredException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonTest {

    @Test
    void happyPath() {
        //GIVEN
        int age = 19;
        String firstName = "firstName";
        String lastName = "lastName";
        Address address = new Address();

        //WHEN
        Person person = new Person(age, firstName, lastName, address);

        //THEN
        assertThat(person.getAge()).isEqualTo(19);
        assertThat(person.getFirstName()).isEqualTo("firstName");
        assertThat(person.getLastName()).isEqualTo("lastName");
        assertThat(person.getAddress()).isEqualTo(address);
    }

    @Test
    void givenAgeLowerThan18_WhenCallingConstructor_ThenThrowAgeRequirementException() {
        assertThatThrownBy(() -> new Person(17, "firstName", "lastName", new Address()))
                .isInstanceOf(AgeRequirementException.class)
                .hasMessage("Person needs to be 18 or older");
    }

    @Test
    void givenNoFirstName_WhenCallingConstructor_ThenThrowFirstNameRequiredException() {
        assertThatThrownBy(() -> new Person(19, null, "lastName", new Address()))
                .isInstanceOf(FirstNameRequiredException.class)
                .hasMessage("First name is required");
    }

    @Test
    void givenEmptyFirstName_WhenCallingConstructor_ThenThrowFirstNameRequiredException() {
        assertThatThrownBy(() -> new Person(19, "", "lastName", new Address()))
                .isInstanceOf(FirstNameRequiredException.class)
                .hasMessage("First name is required");
    }

    @Test
    void givenNoLastName_WhenCallingConstructor_ThenThrowLastNameRequiredException() {
        assertThatThrownBy(() -> new Person(19, "firstName", null, new Address()))
                .isInstanceOf(LastNameRequiredException.class)
                .hasMessage("Last name is required");
    }

    @Test
    void givenEmptyLastName_WhenCallingConstructor_ThenThrowLastNameRequiredException() {
        assertThatThrownBy(() -> new Person(19, "firstName", "", new Address()))
                .isInstanceOf(LastNameRequiredException.class)
                .hasMessage("Last name is required");
    }

    @Test
    void givenNoAddress_WhenCallingConstructor_ThenThrowAddressRequiredException() {
        assertThatThrownBy(() -> new Person(19, "firstName", "lastName", null))
                .isInstanceOf(AddressRequiredException.class)
                .hasMessage("Address is required");
    }
}
