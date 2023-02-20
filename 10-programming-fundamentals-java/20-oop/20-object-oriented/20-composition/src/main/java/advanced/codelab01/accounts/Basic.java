package advanced.codelab01.accounts;

import advanced.codelab01.AccountOwner;

public class Basic extends Account {

    private final double MAX_DAILY_AMOUNT = 1000;

    public Basic(double balance, AccountOwner owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > MAX_DAILY_AMOUNT) {
            System.out.println("max daily is 1000");
        }
        super.withdraw(amount);
    }
}
