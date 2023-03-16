package com.switchfully.rest.moviebase.service;

import com.switchfully.rest.moviebase.domain.Movie;
import com.switchfully.rest.moviebase.domain.MovieMapper;
import com.switchfully.rest.moviebase.domain.MovieRepository;
import com.switchfully.rest.moviebase.webapi.dtos.MovieDto;
import com.switchfully.rest.moviebase.webapi.dtos.UpdateMovieDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
	private final MovieMapper movieMapper;
	private final MovieRepository movieRepository;

	public MovieService(MovieMapper movieMapper, MovieRepository movieRepository) {
		this.movieMapper = movieMapper;
		this.movieRepository = movieRepository;
	}

	public List<MovieDto> getAllMovies() {
		return movieMapper.toDTO(new ArrayList<Movie>(movieRepository.getAll()));
	}

	public MovieDto createMovie(MovieDto newMovie) {
		assertValidMovieDTO(newMovie);
		Movie movieToCreate = movieMapper.toDomain(newMovie);
		return movieMapper.toDTO(movieRepository.save(movieToCreate));
	}

	private void assertValidMovieDTO(MovieDto movie) {
		if (movie.getTitle() == null || movie.getRuntimeInSeconds() == 0) {
			throw new IllegalArgumentException();
		}
	}

	public MovieDto getMovieById(String id) {
		return movieMapper.toDTO(movieRepository.getById(id));
	}

	public MovieDto updateMovie(String id, UpdateMovieDto updateMovieDto) {
		Movie movieToUpdate = movieRepository.getById(id);
		movieToUpdate.changeRuntime(updateMovieDto.getRuntimeInSeconds());
		//update other things
		return movieMapper.toDTO(movieRepository.save(movieToUpdate));
	}
}
