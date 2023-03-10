package codelab02;

import codelab02.movie.Genre;
import codelab02.movie.Movie;
import codelab02.movie.MovieType;
import codelab02.rentalStore.MovieRentalStore;

public class Main {
	public static void main(String[] args) {
		MovieRentalStore rentalStoreService = new MovieRentalStore();

		Movie scaryMovie = new Movie("Scary Movie", 2, Genre.HORROR, MovieType.TRENDING_MOVIE);
		Movie funnyMovie = new Movie("Jackass2", 3, Genre.COMEDY, MovieType.OLDER_MOVIE);

		rentalStoreService.addMovie(scaryMovie);
		rentalStoreService.addMovie(funnyMovie);

	}
}
