package codelab02.rentalStore;

import codelab02.customer.Customer;
import codelab02.exceptions.CustomerNotFoundException;
import codelab02.exceptions.MovieNotFoundException;
import codelab02.movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRentalStore implements RentalStore {

	private List<Movie> movies = new ArrayList<>();
	private List<Customer> customers = new ArrayList<>();


	public List<Movie> getAllMovies() {
		return movies;
	}

	public Movie getMovieByTitle(String title) {
		return movies.stream()
				.filter(movie -> movie.getTitle().equals(title))
				.findFirst()
				.orElseThrow(() -> new MovieNotFoundException("Movie with title" + title + "not found"));
	}

	public List<Customer> getAllCustomers() {
		return customers;
	}

	public Customer getCustomerByName(String name) {
		return customers.stream()
				.filter(customer -> customer.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new CustomerNotFoundException("Customer not found."));
	}

}
