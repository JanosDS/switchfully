package _04_proxy._02_Bankaccount_example;

import _04_proxy._02_Bankaccount_example.bankaccount.Bankaccount;
import _04_proxy._02_Bankaccount_example.bankaccount.exceptions.DatabankException;

import java.util.ArrayList;

public class BankDatabase {

	private ArrayList<Bankaccount> bankaccounts = new ArrayList<>() {
	};

	public BankDatabase() {
		bankaccounts.add(new Bankaccount(9000, "Janos", 1234));
		bankaccounts.add(new Bankaccount(20000, "Sven", 1234));
	}

	public Bankaccount findBankaccount(String client) {
		System.out.println("Searching the database takes a long time ...");
		for (Bankaccount bankaccount : bankaccounts) {
			if (bankaccount.getClient().equals(client)) {
				return bankaccount;
			}
		}
		throw new DatabankException("Couldn't find account with name: " + client);
	}

}
