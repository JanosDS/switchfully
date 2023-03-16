package com.switchfully.rest.moviebase.domain;

import com.switchfully.rest.moviebase.webapi.dtos.MovieDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieMapper {
	public List<MovieDto> toDTO(List<Movie> movieList) {
		return movieList.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public MovieDto toDTO(Movie movie) {
		return new MovieDto(movie.getId(), movie.getTitle(), movie.getDescription(), movie.getRuntimeInSeconds());
	}

	public Movie toDomain(MovieDto movie) {
		return new Movie(movie.getTitle(), movie.getDescription(), movie.getRuntimeInSeconds());
	}
}
