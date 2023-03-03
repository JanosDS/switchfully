package _04_proxy._02_Bankaccount_example.bankaccount.exceptions;

public class WithdrawalException extends RuntimeException {
	public WithdrawalException(String message) {
		super(message);
	}
}
