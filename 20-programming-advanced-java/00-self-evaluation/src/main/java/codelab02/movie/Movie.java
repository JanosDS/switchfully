package codelab02.movie;

public class Movie {
	private String title;
	private double price;
	private Genre genre;
	private MovieType movieType;

	public Movie(String title, double price, Genre genre, MovieType movieType) {
		this.title = title;
		this.price = price;
		this.genre = genre;
		this.movieType = movieType;
	}

	public String getTitle() {
		return title;
	}

	public void downGrade() {
		movieType = movieType.downGrade();
	}

	public MovieType getMovieType() {
		return movieType;
	}

	@Override
	public String toString() {
		StringBuilder movieDetails = new StringBuilder();
		movieDetails.append(title);
		movieDetails.append(": ").append(movieType).append(" -").append(price).append("Eur");

		return movieDetails.toString();
	}
}
