package basic.codelab02;

import java.io.IOException;

/**
 * Read the README.md file
 */
class MyExceptionV2Service {

	void doSomethingExceptional() throws IOException {
		// throw an exception (read the readme.md file)
		throw new IOException("Exception");
	}

}
