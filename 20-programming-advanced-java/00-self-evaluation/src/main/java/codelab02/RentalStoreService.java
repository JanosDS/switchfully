package codelab02;

import codelab02.customer.Customer;
import codelab02.movie.Movie;
import codelab02.rental.Rental;

import java.util.ArrayList;
import java.util.List;

public class RentalStoreService {
	private final int MAX_RENTALS_PER_SERVICE = 20;
	private final int MAX_MOVIES_PER_SERVICE = 10;
	private final int MAX_CUSTOMERS_PER_SERVICE = 5;

	private List<Rental> rentals = new ArrayList<>();
	private List<Movie> movies = new ArrayList<>();
	private List<Customer> customers = new ArrayList<>();


	public void addRental(Rental rental) {
		if (rentals.size() < MAX_RENTALS_PER_SERVICE) {
			rentals.add(rental);
		}
	}

	public void addMovie(Movie movie) {
		if (movies.size() < MAX_MOVIES_PER_SERVICE) {
			movies.add(movie);
		}
	}

	public void addCustomer(Customer customer) {
		if (customers.size() < MAX_CUSTOMERS_PER_SERVICE) {
			customers.add(customer);
		}
	}

}
