package basic.solutions.codelab05.exception;

public class BalanceToLowException extends RuntimeException {

    public BalanceToLowException() {
        super("Balance needs to be 250 or higher");
    }
}
