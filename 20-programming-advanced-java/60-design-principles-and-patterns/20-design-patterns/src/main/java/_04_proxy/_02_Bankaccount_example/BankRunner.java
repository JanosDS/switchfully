package _04_proxy._02_Bankaccount_example;

import _04_proxy._02_Bankaccount_example.bankaccount.*;

import java.util.Scanner;

public class BankRunner {

	public static void main(String[] args) {

		Bankaccount bankaccountJanos = new Bankaccount(9000, "Janos", 1234);
		Bankaccount bankaccountSven = new Bankaccount(20000, "Sven", 1234);

		BankaccountInformation infoScreenJanos = new BankaccountInformationProxy(bankaccountJanos);
		BankaccountInformation infoScreenSven = new BankaccountInformationProxy(bankaccountSven);
//		try {
//			System.out.println(infoScreenJanos.getClient() + " has " + infoScreenJanos.getMoney() + "Euro");
//			System.out.println("Enter pincode to access your account.");
//			BankaccountWithdrawProxy geldMuur = new BankaccountWithdrawProxy(bankaccountJanos, askPincode());
//			System.out.println("WITHDRAWING MONEY");
//			geldMuur.withDrawMoney(askAmount(), askPincode());
//
//		} catch (RuntimeException exception) {
//			System.err.println(exception.getMessage());
//		}
//
//		System.out.println(infoScreenJanos.getClient() + " has " + infoScreenJanos.getMoney() + "Euro");
//		System.out.println(infoScreenSven.getClient() + " has " + infoScreenSven.getMoney() + "Euro");

		try {
			System.out.println(infoScreenJanos.getClient() + ": Opening transaction proxy");
			BankaccountTransactionProxy bankaccountTransactionProxyJanos = new BankaccountTransactionProxy(bankaccountJanos, askPincode());
			System.out.println("executing Transaction 1");
			bankaccountTransactionProxyJanos.transaction(askAmount(), new BankaccountDepositProxy(bankaccountSven), askPincode());
			System.out.println();
			System.out.println("executing Transaction 2");
			bankaccountTransactionProxyJanos.transaction(askAmount(), new BankaccountDepositProxy(bankaccountSven), askPincode());

		} catch (RuntimeException exception) {
			System.err.println(exception.getMessage());
		}
		System.out.println(infoScreenJanos.getClient() + " has " + infoScreenJanos.getMoney() + "Euro");
		System.out.println(infoScreenSven.getClient() + " has " + infoScreenSven.getMoney() + "Euro");
	}

	public static int askPincode() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter pincode:");
		return in.nextInt();
	}

	public static int askAmount() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter amount of money:");
		return in.nextInt();
	}

}
