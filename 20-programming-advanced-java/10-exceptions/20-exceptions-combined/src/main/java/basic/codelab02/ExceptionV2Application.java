package basic.codelab02;

import java.io.IOException;

/**
 * Read the README.md file
 */
public class ExceptionV2Application {

	public static void main(String[] args) {

		MyExceptionV2Service myExceptionService = new MyExceptionV2Service();
		try {
			myExceptionService.doSomethingExceptional();
		} catch (IOException exception) {
			System.err.println(exception.getMessage());
		}
		System.out.println("I can show you the world!");

	}

}
