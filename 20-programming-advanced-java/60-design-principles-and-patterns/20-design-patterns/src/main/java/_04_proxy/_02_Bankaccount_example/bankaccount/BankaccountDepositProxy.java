package _04_proxy._02_Bankaccount_example.bankaccount;

import _04_proxy._02_Bankaccount_example.bankaccount.exceptions.DepositException;
import _04_proxy._02_Bankaccount_example.bankaccount.operations.Deposit;

import java.util.ArrayList;
import java.util.Objects;

public class BankaccountDepositProxy implements BankaccountDeposit {

	private Bankaccount bankaccount;

	private ArrayList<Deposit> deposits = new ArrayList<>();

	public BankaccountDepositProxy(Bankaccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public void depositMoney(double amount) {
		Deposit newDeposit = new Deposit(amount);
		if (!deposits.contains(newDeposit)) {
			bankaccount.depositMoney(amount);
			deposits.add(newDeposit);
		} else {
			throw new DepositException("This deposit has already been done.");
		}
	}

	public ArrayList<Deposit> getDeposits() {
		return this.deposits;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BankaccountDepositProxy that = (BankaccountDepositProxy) o;
		return Objects.equals(bankaccount, that.bankaccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankaccount);
	}
}
