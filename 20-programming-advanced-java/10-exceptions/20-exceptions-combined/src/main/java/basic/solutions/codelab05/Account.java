package basic.solutions.codelab05;

import basic.solutions.codelab05.exception.BalanceToLowException;

public class Account {
    public Account(Person person, int balance) {
        if (balance < 250) {
            throw new BalanceToLowException();
        }
    }
}
