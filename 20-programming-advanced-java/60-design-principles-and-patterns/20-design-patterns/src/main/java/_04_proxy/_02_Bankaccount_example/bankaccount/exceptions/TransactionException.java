package _04_proxy._02_Bankaccount_example.bankaccount.exceptions;

public class TransactionException extends RuntimeException {

	public TransactionException(String message) {
		super(message);
	}
}
