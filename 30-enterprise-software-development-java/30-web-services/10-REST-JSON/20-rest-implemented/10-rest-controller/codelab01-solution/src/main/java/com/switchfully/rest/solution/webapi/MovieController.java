package com.switchfully.rest.solution.webapi;

import com.switchfully.rest.solution.domain.Movie;
import com.switchfully.rest.solution.domain.MovieRepository;
import com.switchfully.rest.solution.webapi.dtos.CreateMovieDto;
import com.switchfully.rest.solution.webapi.dtos.MovieDto;
import com.switchfully.rest.solution.webapi.dtos.UpdateMovieDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "movies")
public class MovieController {

    private MovieRepository movieRepository;
    private MovieMapper movieMapper;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
        this.movieMapper = new MovieMapper();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json", produces = "application/json")
    public MovieDto createMovie(@RequestBody CreateMovieDto createMovieDto) {
        Movie movie = movieMapper.mapToMovie(createMovieDto);
        Movie savedMovie = movieRepository.save(movie);
        return movieMapper.mapToDTO(savedMovie);
    }


    @ResponseStatus(HttpStatus.OK)
    @PutMapping(consumes = "application/json", produces = "application/json", path = "{id}")
    public MovieDto updateMovie(@RequestBody UpdateMovieDto updateMovieDto, @PathVariable String id) {
        Movie movie = movieRepository.getById(id);
        movie.setTitle(updateMovieDto.getTitle());
        movie.setDescription(updateMovieDto.getDescription());
        movie.setRuntimeInSeconds(updateMovieDto.getRuntimeInSeconds());
        return movieMapper.mapToDTO(movie);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json")
    public List<MovieDto> getAllMovies() {
        return movieRepository.getAll().stream()
                .map(movie -> movieMapper.mapToDTO(movie))
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = "application/json", path = "{id}")
    public MovieDto getAllMovies(@PathVariable String id) {
        return movieMapper.mapToDTO(movieRepository.getById(id));
    }


}
