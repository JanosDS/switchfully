package codelab02.rentalStore;

import codelab02.customer.Customer;
import codelab02.movie.Genre;
import codelab02.movie.Movie;
import codelab02.movie.MovieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MovieRentalStoreTest {

	private MovieRentalStore rentalStoreService;
	private Movie scaryMovie;
	private Movie funnyMovie;
	private Customer client;

	@BeforeEach
	void setupRentalStore() {
		rentalStoreService = new MovieRentalStore();
		scaryMovie = new Movie("Scary Movie", 2, Genre.HORROR, MovieType.TRENDING_MOVIE);
		funnyMovie = new Movie("Jackass2", 3, Genre.COMEDY, MovieType.OLDER_MOVIE);
		rentalStoreService.addMovie(scaryMovie);
		rentalStoreService.addMovie(funnyMovie);
		client = new Customer("Client", LocalDate.of(2000, 9, 7));
		rentalStoreService.addCustomer(client);
	}

	@Test
	void getMovieByTitle() {
		Movie result = rentalStoreService.getMovieByTitle("Scary Movie");
		Assertions.assertEquals(scaryMovie, result);
	}

	@Test
	void getCustomerByName() {
		Customer result = rentalStoreService.getCustomerByName("Client");
		Assertions.assertEquals(client, result);
	}
}