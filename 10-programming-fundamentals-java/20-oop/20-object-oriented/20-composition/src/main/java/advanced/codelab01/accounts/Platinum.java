package advanced.codelab01.accounts;

import advanced.codelab01.AccountOwner;

public class Platinum extends Account {
    public Platinum(double balance, AccountOwner owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(super.getBalance() - amount);
    }
}
