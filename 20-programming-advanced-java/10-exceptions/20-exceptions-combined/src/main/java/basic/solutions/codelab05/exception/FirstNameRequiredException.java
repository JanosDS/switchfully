package basic.solutions.codelab05.exception;

public class FirstNameRequiredException extends RuntimeException {
    public FirstNameRequiredException() {
        super("First name is required");
    }
}
