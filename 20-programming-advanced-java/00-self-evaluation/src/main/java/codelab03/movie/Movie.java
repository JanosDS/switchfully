package codelab03.movie;

public class Movie {
	private final String title;
	private MovieType movieType;
	private int priceCode;

	public Movie(String title, MovieType movieType) {
		this.title = title;
		this.movieType = movieType;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public MovieType getMovieType() {
		return movieType;
	}

	/**
	 * Upon refactoring, make sure this feature (of setting a Movie to a new price code) is not lost.
	 * Similar functionality should be available after refactoring.
	 */
	public void setPriceCode(int arg) {
		priceCode = arg;
	}

	public String getTitle() {
		return title;
	}

}
