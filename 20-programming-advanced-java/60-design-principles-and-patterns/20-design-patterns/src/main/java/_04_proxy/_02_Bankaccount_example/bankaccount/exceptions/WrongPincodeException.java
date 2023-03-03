package _04_proxy._02_Bankaccount_example.bankaccount.exceptions;

public class WrongPincodeException extends RuntimeException {

	public WrongPincodeException(String message) {
		super(message);
	}
}
