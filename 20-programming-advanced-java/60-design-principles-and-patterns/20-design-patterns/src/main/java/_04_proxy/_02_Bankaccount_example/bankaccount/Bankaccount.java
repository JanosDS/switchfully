package _04_proxy._02_Bankaccount_example.bankaccount;

import _04_proxy._02_Bankaccount_example.bankaccount.exceptions.WrongPincodeException;

public class Bankaccount implements BankaccountWithdraw, BankaccountDeposit, BankaccountInformation {

	private double money;
	private String client;

	private int pincode;

	public Bankaccount(double money, String client, int pincode) {
		this.money = money;
		this.client = client;
		this.pincode = pincode;
	}

	@Override
	public double getMoney() {
		return money;
	}

	@Override
	public String getClient() {
		return client;
	}

	@Override
	public void depositMoney(double amount) {
		money += amount;
	}

	@Override
	public void withDrawMoney(double amount, int pincode) {
		money -= amount;
	}

	public void validatePincode(int pincode) {
		if (this.pincode != pincode) {
			throw new WrongPincodeException("Wrong pincode");
		}
	}
}
