package _04_proxy._02_Bankaccount_example.bankaccount;

import _04_proxy._02_Bankaccount_example.bankaccount.exceptions.WithdrawalException;
import _04_proxy._02_Bankaccount_example.bankaccount.operations.Withdrawal;

import java.util.ArrayList;

public class BankaccountWithdrawProxy implements BankaccountWithdraw {
	private Bankaccount bankaccount;

	private ArrayList<Withdrawal> withdrawals = new ArrayList<>();

	public BankaccountWithdrawProxy(Bankaccount bankaccount, int pincode) {
		this.bankaccount = bankaccount;
		bankaccount.validatePincode(pincode);
	}

	@Override
	public void withDrawMoney(double amount, int pincode) {
		System.out.println("Executing extra security checks before withdrawing the money.");
		bankaccount.validatePincode(pincode);

		Withdrawal withdrawal = new Withdrawal(amount);
		if (!withdrawals.contains(withdrawal)) {
			bankaccount.withDrawMoney(amount, pincode);
			System.out.println("The withdrawal was done successfull.");
		} else {
			throw new WithdrawalException("This withdrawal has already been done.");
		}
	}

}
