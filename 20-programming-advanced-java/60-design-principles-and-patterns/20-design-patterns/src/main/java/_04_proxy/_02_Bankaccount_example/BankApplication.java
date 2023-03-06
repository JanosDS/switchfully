package _04_proxy._02_Bankaccount_example;

import _04_proxy._02_Bankaccount_example.bankaccount.Bankaccount;
import _04_proxy._02_Bankaccount_example.bankaccount.BankaccountDepositProxy;
import _04_proxy._02_Bankaccount_example.bankaccount.BankaccountInformationProxy;
import _04_proxy._02_Bankaccount_example.bankaccount.BankaccountTransactionProxy;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to your banking application.");
		System.out.println("please enter your information:");
		System.out.println("please enter your account name: ");
//		Before we allow access to any operations, the user needs to login.
//		To do this, we use a proxy that only allows the display of information
//		This proxy recieves the data from a database search.
		BankaccountInformationProxy bankaccountInfo = new BankaccountInformationProxy(findAccountByName(in));
		try {
			bankaccountInfo.validatePincode(askPincode(in));
			in.nextLine();
			System.out.println("Welcome " + bankaccountInfo.getClient() + " you have " + bankaccountInfo.getMoney() + " money.");
			// ask the information needed to perform a transaction
			System.out.println("To who do you want to send money?");
			// search for the recieving account in the database
			BankaccountInformationProxy bankaccountRecieverInfo = new BankaccountInformationProxy(findAccountByName(in));
			// ask information needed to do the transaction
			int amount = askAmount(in);
			in.nextLine();
			int pincode = askPincode(in);
			in.nextLine();
			// create the transaction proxy
			BankaccountTransactionProxy transactionProxy = new BankaccountTransactionProxy(bankaccountInfo.getBankaccount(), pincode);
			// create a deposit proxy of the recieving bankaccount, and utilise this in the transaction
			transactionProxy.transaction(amount, new BankaccountDepositProxy(bankaccountRecieverInfo.getBankaccount()), pincode);

			// What if ...
			System.out.println("Oh no, you double tapped the transaction button");
			transactionProxy.transaction(amount, new BankaccountDepositProxy(bankaccountRecieverInfo.getBankaccount()), pincode);

		} catch (RuntimeException exception) {
			System.err.println(exception.getMessage());
		}

		System.out.println("end of transaction.");
		System.out.println(bankaccountInfo.getClient() + " you have " + bankaccountInfo.getMoney() + " money.");

	}

	public static Bankaccount findAccountByName(Scanner in) {
		String name = in.nextLine();
		BankDatabase dbConnection = new BankDatabase();
		return dbConnection.findBankaccount(name);
	}

	public static int askPincode(Scanner in) {
		System.out.println("Please enter pincode:");
		return in.nextInt();
	}

	public static int askAmount(Scanner in) {
		System.out.println("Please enter the amount of money:");
		return in.nextInt();
	}

}
