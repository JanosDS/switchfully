package codelab03;

import codelab03.movie.Movie;
import codelab03.movie.MovieType;
import codelab03.rental.Rental;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

	@Test
	void statement_givenCustomerWithOneRentalFor3DaysContainingARegularMovie_thenReturnCorrectResult() {
		Customer customer = createCustomerWithRentals("Becky",
				new Rental[]{
						new Rental(new Movie("Minority Report", MovieType.REGULAR), 3)
				});
		String expectedResult = String.format("Rental Record for Becky%n" +
				"\tMinority Report\t3.5%n" +
				"Amount owed is 3.5%n" +
				"You earned 1 frequent renter points");

		String actualResult = customer.getRentalRecord();

		assertThat(actualResult).isEqualToNormalizingNewlines(expectedResult);
	}

	private Customer createCustomerWithRentals(String customerName, Rental[] rentals) {
		Customer customer = new Customer(customerName);
		for (Rental rental : rentals) {
			customer.addRental(rental);
		}
		return customer;
	}

	@Test
	void statement_givenCustomerWithOneRentalFor3DaysContainingANewReleaseMovie_thenReturnCorrectResult() {
		Customer customer = createCustomerWithRentals("Bruce",
				new Rental[]{
						new Rental(new Movie("A Quiet Place", MovieType.NEW_RELEASE), 3)
				});
		String expectedResult = String.format("Rental Record for Bruce%n" +
				"\tA Quiet Place\t9.0%n" +
				"Amount owed is 9.0%n" +
				"You earned 2 frequent renter points");

		String actualResult = customer.getRentalRecord();

		assertThat(actualResult).isEqualToNormalizingNewlines(expectedResult);
	}

	@Test
	void statement_givenCustomerWithOneRentalFor3DaysContainingAChildrensMovie_thenReturnCorrectResult() {
		Customer customer = createCustomerWithRentals("Lil' Timmy",
				new Rental[]{
						new Rental(new Movie("Wall-E", MovieType.CHILDRENS), 3)
				});
		String expectedResult = String.format("Rental Record for Lil' Timmy%n" +
				"\tWall-E\t1.5%n" +
				"Amount owed is 1.5%n" +
				"You earned 1 frequent renter points");

		String actualResult = customer.getRentalRecord();

		assertThat(actualResult).isEqualToNormalizingNewlines(expectedResult);
	}

	@Test
	public void statement_givenCustomerWithThreeRentalsContainingMoviesWithDifferentPriceCodes_thenReturnCorrectResult() {
		Customer customer = createCustomerWithRentals("Suzzy",
				new Rental[]{
						new Rental(new Movie("Monsters, inc.", MovieType.CHILDRENS), 6),
						new Rental(new Movie("Game Night", MovieType.NEW_RELEASE), 2),
						new Rental(new Movie("The theory of everything", MovieType.REGULAR), 8),
				});
		String expectedResult = String.format("Rental Record for Suzzy%n" +
				"\tMonsters, inc.\t6.0%n" +
				"\tGame Night\t6.0%n" +
				"\tThe theory of everything\t11.0%n" +
				"Amount owed is 23.0%n" +
				"You earned 4 frequent renter points");

		String actualResult = customer.getRentalRecord();

		assertThat(actualResult).isEqualToNormalizingNewlines(expectedResult);
	}

}
