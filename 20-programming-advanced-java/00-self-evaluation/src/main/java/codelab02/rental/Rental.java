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
		this.returnDate = LocalDate.now().plusWeeks(1);
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
}
