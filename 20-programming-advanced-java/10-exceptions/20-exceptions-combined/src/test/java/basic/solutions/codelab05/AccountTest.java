package basic.solutions.codelab05;

import basic.solutions.codelab05.exception.BalanceToLowException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AccountTest {

    private Person person = new Person(18, "first", "last", new Address());

    @Test
    void happyPath() {
        Account account = new Account(person, 500);
    }

    @Test
    void givenBalanceLowerThan250_WhenCallingConstructor_ThenThrowBalanceToLowException() {
        assertThatThrownBy(() -> new Account(person, 100))
                .isInstanceOf(BalanceToLowException.class)
                .hasMessage("Balance needs to be 250 or higher");
    }
}
