package advanced.codelab01;

import advanced.codelab01.accounts.Account;

import java.util.Scanner;

/**
 * Read the README.md file
 */
public class BankRunner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account owner's firstname");
        String firstName = scan.next();
        System.out.println("Enter account owner's lastname");
        String lastName = scan.next();
        System.out.println("Enter account's initial balance");
        double balance = scan.nextDouble();

        // continue here
        AccountOwner newOwner = new AccountOwner(firstName, lastName);
        Account account = new Account(balance, newOwner);

    }

}
