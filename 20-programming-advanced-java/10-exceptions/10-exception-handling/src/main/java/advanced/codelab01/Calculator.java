package advanced.codelab01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("================================");
		System.out.println("===========          ===========");
		System.out.println("=========  CALCULATOR  =========");
		System.out.println("===========          ===========");
		System.out.println("================================");
		System.out.println("=======                  =======");
		System.out.println("=====   (divisions only)  ======");
		System.out.println("=======                  =======");
		System.out.println("================================");
		System.out.println("================================");

		Scanner in = new Scanner(System.in);
		System.out.println("Provide a numerator (int): ");
		int numerator = 10;
		try {
			numerator = in.nextInt();
		} catch (InputMismatchException ex) {
			System.err.println("(invalid numerator provided. Therefore it is set to value 10)");

		}

		System.out.println("Provide a denominator (int): ");
		in.nextLine();
		int denominator = 5;
		try {
			denominator = in.nextInt();
		} catch (InputMismatchException ex) {
			System.err.println("(invalid denominator provided. Therefore it is set to value 5)");
		}

		try {
			var result = CalculatorService.divide(numerator, denominator);
			System.out.println("The quotient of the division is: " + result);
		} catch (ArithmeticException ex) {
			System.err.println(ex.getMessage());
		}
	}

}
