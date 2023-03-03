package _04_proxy._02_Bankaccount_example.bankaccount;

import java.util.Objects;

public class BankaccountInformationProxy implements BankaccountInformation {

	private Bankaccount bankaccount;

	public BankaccountInformationProxy(Bankaccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public double getMoney() {
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
