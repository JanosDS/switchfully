package advanced.codelab01.accounts;

import advanced.codelab01.AccountOwner;

public class Premium extends Account {
    private final double MAX_DAILY_AMOUNT = 2000;

    public Premium(double balance, AccountOwner owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > MAX_DAILY_AMOUNT) {
            System.out.println("max daily is 2000");
        }
        super.withdraw(amount);
    }
}
