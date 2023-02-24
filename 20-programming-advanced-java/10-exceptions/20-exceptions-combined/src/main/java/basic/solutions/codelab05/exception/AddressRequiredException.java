package basic.solutions.codelab05.exception;

public class AddressRequiredException extends RuntimeException {
    public AddressRequiredException() {
        super("Address is required");
    }
}
