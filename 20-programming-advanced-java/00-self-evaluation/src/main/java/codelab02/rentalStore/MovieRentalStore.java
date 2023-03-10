package codelab02.rentalStore;

import codelab02.customer.Customer;
import codelab02.exceptions.CustomerNotFoundException;
import codelab02.exceptions.MovieNotFoundException;
import codelab02.movie.Movie;
import codelab02.rental.Rental;

import java.util.ArrayList;
import java.util.List;

public class MovieRentalStore {

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

	@Override
	public String toString() {
		String SPACING = "     ";
		StringBuilder storeDetails = new StringBuilder();
		storeDetails.append("The movie rental service has:");
		storeDetails.append("\n- ").append(customers.size()).append(" customers");
		for (Customer customer : customers) {
			storeDetails.append("\n").append(SPACING).append("*").append(customer.toString());
		}
		storeDetails.append("\n- ").append(movies.size()).append(" movies");
		for (Movie movie : movies) {
			storeDetails.append("\n").append(SPACING).append("*").append(movie.toString());
		}
		return storeDetails.toString();
	}
}
