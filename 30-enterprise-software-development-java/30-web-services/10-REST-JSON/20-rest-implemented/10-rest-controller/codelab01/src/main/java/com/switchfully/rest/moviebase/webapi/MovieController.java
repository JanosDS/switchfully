package com.switchfully.rest.moviebase.webapi;

import com.switchfully.rest.moviebase.domain.Movie;
import com.switchfully.rest.moviebase.service.MovieService;
import com.switchfully.rest.moviebase.webapi.dtos.MovieDto;
import com.switchfully.rest.moviebase.webapi.dtos.UpdateMovieDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "movies")
public class MovieController {
	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping(produces = "application/json")
	public List<MovieDto> getMovieList() {
		return movieService.getAllMovies();
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public MovieDto createMovie(@RequestBody MovieDto newMovie) {
		return movieService.createMovie(newMovie);
	}

	@GetMapping(value = "{id}", produces = "application/json")
	public MovieDto getMovieById(@PathVariable String id) {
		return movieService.getMovieById(id);
	}

	@PutMapping(value = "{id}", produces = "application/json")
	public MovieDto updateMovie(@PathVariable String id, UpdateMovieDto updateMovieDto) {
		return movieService.updateMovie(id, updateMovieDto);
	}

}
