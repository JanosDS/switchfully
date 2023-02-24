package basic.solutions.codelab05.exception;

public class LastNameRequiredException extends RuntimeException {
    public LastNameRequiredException() {
        super("Last name is required");
    }
}
