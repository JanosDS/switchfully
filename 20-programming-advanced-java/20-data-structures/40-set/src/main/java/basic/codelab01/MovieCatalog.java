package basic.codelab01;

import java.util.HashSet;
import java.util.Set;

class MovieCatalog {

	private final String name;
	private final Set<Movie> movies;

	MovieCatalog(String name) {
		this.name = name;
		movies = new HashSet<>();
	}

	MovieCatalog addMovie(Movie movie) {
		movies.add(movie);
		return this;
	}

	/**
	 * Should return only the movies that exist in both movie catalogs
	 */
	Movie[] getIntersectionOf(MovieCatalog otherMovieCatalog) {
		Set<Movie> moviesInBoth = new HashSet<>(movies);
		moviesInBoth.retainAll(otherMovieCatalog.getMovies());
		Movie[] movieArray = new Movie[moviesInBoth.size()];
		moviesInBoth.toArray(movieArray);
		return movieArray;
	}

	/**
	 * Should return all the movies, of both movie catalogs combined
	 */
	Movie[] getUnionOf(MovieCatalog otherMovieCatalog) {
		Set<Movie> moviesCombined = new HashSet<>(movies);
		moviesCombined.addAll(otherMovieCatalog.getMovies());
		Movie[] movieArray = new Movie[moviesCombined.size()];
		moviesCombined.toArray(movieArray);
		return movieArray;
	}

	/**
	 * If this movie catalog includes all the movies of the other movie catalog, then return true.
	 */
	boolean isSubsetOf(MovieCatalog otherMovieCatalog) {
		return movies.containsAll(otherMovieCatalog.getMovies());
	}

	public Set<Movie> getMovies() {
		return movies;
	}
}
