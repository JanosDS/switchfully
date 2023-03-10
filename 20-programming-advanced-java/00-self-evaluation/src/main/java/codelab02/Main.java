package codelab02;

import codelab02.customer.Customer;
import codelab02.exceptions.CustomerNotFoundException;
import codelab02.movie.Genre;
import codelab02.movie.Movie;
import codelab02.movie.MovieType;
import codelab02.rentalStore.MovieRentalStore;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RentalService service = new RentalService();
		Scanner scanner = new Scanner(System.in);

		service.printServiceOverview();

		service.askRenter(scanner);

		service.askMovieToRent(scanner);

		service.printRental();

	}
}
