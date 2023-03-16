package codelab02.rental;

import codelab02.customer.Customer;
import codelab02.movie.Movie;

import java.time.LocalDate;

public class Rental {
	private Customer customer;
	private Movie movie;
	private LocalDate returnDate;

	public Rental(Customer customer, Movie movie) {
		this.customer = customer;
		this.movie = movie;
		this.returnDate = LocalDate.now().plusDays(movie.getRentDays());
	}

	public Customer getCustomer() {
		return customer;
	}

	public Movie getMovie() {
		return movie;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	@Override
	public String toString() {
		StringBuilder rentalDetails = new StringBuilder();
		rentalDetails.append("-- NEW RENTAL --");
		rentalDetails.append("\n").append(customer);
		rentalDetails.append("\n").append(movie);
		rentalDetails.append("\n").append(returnDate);
		return rentalDetails.toString();
	}
}
