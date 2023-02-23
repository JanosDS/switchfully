package basic.solutions.codelab05.exception;

public class AgeRequirementException extends RuntimeException {

    public AgeRequirementException() {
        super("Person needs to be 18 or older");
    }
}
