package _04_proxy._02_Bankaccount_example.bankaccount;

import _04_proxy._02_Bankaccount_example.BankDatabase;

import java.util.Objects;
import java.util.Scanner;

public class BankaccountInformationProxy implements BankaccountInformation {

	private Bankaccount bankaccount;

	public BankaccountInformationProxy(Bankaccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public BankaccountInformationProxy(String name) {

		this.bankaccount = findAccountByName(name);
	}

	public static Bankaccount findAccountByName(String name) {
		BankDatabase dbConnection = new BankDatabase();
		return dbConnection.findBankaccount(name);
	}

	public void validatePincode(int pincode) {
		//Limit this access and log all attempts
		bankaccount.validatePincode(pincode);
	}

	public Bankaccount getBankaccount() {
		return bankaccount;
	}

	@Override
	public double getMoney() {
		// Limit the access to this
		return bankaccount.getMoney();
	}

	@Override
	public String getClient() {
		return bankaccount.getClient();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BankaccountInformationProxy that = (BankaccountInformationProxy) o;
		return Objects.equals(bankaccount, that.bankaccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankaccount);
	}
}
