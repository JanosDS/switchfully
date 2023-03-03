package _04_proxy._02_Bankaccount_example.bankaccount.operations;

import _04_proxy._02_Bankaccount_example.bankaccount.BankaccountDepositProxy;

import java.util.Objects;

public class Transaction {
	private double amount;
	private BankaccountDepositProxy reciever;

	public Transaction(double amount, BankaccountDepositProxy reciever) {
		this.amount = amount;
		this.reciever = reciever;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Transaction that = (Transaction) o;
		return Double.compare(that.amount, amount) == 0 && Objects.equals(reciever, that.reciever);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, reciever);
	}
}
