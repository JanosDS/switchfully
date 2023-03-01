package basic.codelab03;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateApplication {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int year = askYear(in);
		int month = askMonth(in);
		int day = askDay(in);

		try {
			MyOwnLocalDate.create(year, month, day);
		} catch (DateTimeException exception) {
			System.err.println(exception.getMessage());
		}
	}

	public static int askYear(Scanner in) {
		try {
			System.out.println("Give a year:");
			return MyOwnLocalDate.validateYear(in.nextInt());
		} catch (DateTimeException exception) {
			System.err.println(exception.getMessage());
		}
		return askYear(in);
	}

	public static int askMonth(Scanner in) {
		try {
			System.out.println("Give a month:");
			return MyOwnLocalDate.validateMonth(in.nextInt());
		} catch (DateTimeException exception) {
			System.err.println(exception.getMessage());
		}
		return askMonth(in);
	}

	public static int askDay(Scanner in) {
		try {
			System.out.println("Give a day:");
			return MyOwnLocalDate.validateDayOfMonth(in.nextInt());
		} catch (DateTimeException exception) {
			System.err.println(exception.getMessage());
		}
		return askDay(in);
	}
}
