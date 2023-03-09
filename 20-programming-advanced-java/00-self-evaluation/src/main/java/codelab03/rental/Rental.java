package codelab03.rental;

import codelab03.movie.Movie;
import codelab03.movie.MovieType;

public class Rental {

	private final Movie movie;
	private final int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getPrice() {
		double price = 0;
		if (movie.getMovieType() == MovieType.REGULAR) {
			price += 2;
			if (daysRented > 2) {
				price += (daysRented - 2) * 1.5;
			}
		}
		if (movie.getMovieType() == MovieType.CHILDRENS) {
			price += 1.5;
			if (daysRented > 3) {
				price += (daysRented - 3) * 1.5;
			}
		}
		if (movie.getMovieType() == MovieType.NEW_RELEASE) {
			price += daysRented * 3;
		}
		return price;
	}

}
