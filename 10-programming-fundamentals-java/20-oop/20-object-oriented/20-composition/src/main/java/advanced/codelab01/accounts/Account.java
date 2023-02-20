package advanced.codelab01.accounts;

import advanced.codelab01.AccountOwner;

/**
 * Read the README.md file
 */
public class Account {
    private static int accountCounter;
    private final int MAX_ACCOUNTNUMBER = 50000000;
    private final double MAX_WITHDRAW_AMOUNT = 5000;
    private final double MAX_DEPOSIT_AMOUNT = 80000;
    private AccountOwner accountOwner;
    private double balance;
    private long accountNumber;


    public Account(double balance, AccountOwner owner) {
        this.accountOwner = owner;
        this.balance = balance;
        this.accountNumber = (long) (Math.random() * MAX_ACCOUNTNUMBER);
        accountCounter += 1;
    }

    public static int getNumberOfAccounts() {
        return accountCounter;
    }

    public void withdraw(double amount) {
        if (amount > MAX_WITHDRAW_AMOUNT) {
            System.out.println("You can not withdraw more than 5000.");
        } else if (amount > balance) {
            System.out.println("You can not withdraw below zero.");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > MAX_DEPOSIT_AMOUNT) {
            System.out.println("You can not deposit more than 80000.");
        } else {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account with number " + accountNumber + " and owner " + accountOwner.toString() + " has balance " + balance;
    }
}
