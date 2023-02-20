package advanced.codelab01.accounts;

import advanced.codelab01.AccountOwner;

public class Free extends Account {
    private final double MAX_DAILY_AMOUNT = 100;

    public Free(double balance, AccountOwner owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > MAX_DAILY_AMOUNT) {
            System.out.println("max daily is 100");
        }
        super.withdraw(amount);
        super.withdraw(amount);
    }
}
