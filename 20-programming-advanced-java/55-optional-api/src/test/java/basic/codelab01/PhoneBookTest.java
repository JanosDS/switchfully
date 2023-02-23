package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneBookTest {

    private PhoneBook phoneBook = new PhoneBook();

    @Test
    void findPhoneNumberByName() {
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("Jos de Vos");

        assertThat(phoneNumber.get()).isEqualTo("016/161616");
    }

    @Test
    void findPhoneNumberByName_NotFound() {
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("Jos de Voss");

        Assertions.assertThatThrownBy(() -> phoneNumber.get()).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void findNameByPhoneNumber() {
        Optional<String> name = phoneBook.findNameByPhoneNumber("016/161616");

        assertThat(name.get()).isEqualTo("Jos de Vos");
    }

    @Test
    void findNameByPhoneNumber_NotFound() {
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("016/161619");

        Assertions.assertThatThrownBy(() -> phoneNumber.get()).isInstanceOf(NoSuchElementException.class);
    }

}
