package codelab02.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

	@Test
	void downGrade_OneDayMovie_toTrendingMovie() {
		Movie movie = new Movie("MIB17", 5, Genre.COMEDY, MovieType.ONE_DAY_MOVIE);
		movie.downGrade();
		Assertions.assertEquals(MovieType.TRENDING_MOVIE, movie.getMovieType());
	}

	@Test
	void downGrade_OlderMovie_toOlderMovie() {
		Movie movie = new Movie("MIB17", 5, Genre.COMEDY, MovieType.OLDER_MOVIE);
		movie.downGrade();
		Assertions.assertEquals(MovieType.OLDER_MOVIE, movie.getMovieType());
	}
}