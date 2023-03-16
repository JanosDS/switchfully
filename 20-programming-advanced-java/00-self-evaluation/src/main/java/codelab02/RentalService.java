package codelab02;

import codelab02.customer.Customer;
import codelab02.exceptions.CustomerNotFoundException;
import codelab02.exceptions.MovieNotFoundException;
import codelab02.movie.Genre;
import codelab02.movie.Movie;
import codelab02.movie.MovieType;
import codelab02.rental.Rental;
import codelab02.rentalStore.MovieRentalStore;

import java.time.LocalDate;
import java.util.Scanner;

public class RentalService {

	private final MovieRentalStore rentalStoreService;

	private Customer renter;
	private Movie movieToRent;

	private Rental rental;

	public RentalService() {
		rentalStoreService = new MovieRentalStore();
		setup();
	}

	private void setup() {
		Movie scaryMovie = new Movie("Scary Movie", 2, Genre.HORROR, MovieType.TRENDING_MOVIE);
		Movie funnyMovie = new Movie("Jackass2", 3, Genre.COMEDY, MovieType.OLDER_MOVIE);
		Customer customer1 = new Customer("Janos", LocalDate.of(1996, 01, 16));
		Customer customer2 = new Customer("Franky", LocalDate.of(2013, 12, 24));
		rentalStoreService.addMovie(scaryMovie);
		rentalStoreService.addMovie(funnyMovie);
		rentalStoreService.addCustomer(customer1);
		rentalStoreService.addCustomer(customer2);
	}

	public void printServiceOverview() {
		System.out.println(rentalStoreService);
	}

	public void askRenter(Scanner scanner) {
		System.out.println("Who wants to rent a movie?");
		while (!rentalStoreService.getAllCustomers().contains(renter)) {
			try {
				System.out.println("Enter a customers name:");
				String name = scanner.nextLine();
				renter = rentalStoreService.getCustomerByName(name);
			} catch (CustomerNotFoundException exception) {
				System.err.println(exception.getMessage());
			}
		}
	}

	public void askMovieToRent(Scanner scanner) {
		System.out.println("What movie do you want to rent?");
		while (!rentalStoreService.getAllMovies().contains(movieToRent)) {
			try {
				System.out.println("Enter a movie title:");
				String title = scanner.nextLine();
				movieToRent = rentalStoreService.getMovieByTitle(title);
			} catch (MovieNotFoundException exception) {
				System.err.println(exception.getMessage());
			}
		}
	}

	public void printRental() {
		rental = new Rental(renter, movieToRent);
		System.out.println(rental);
	}

}
