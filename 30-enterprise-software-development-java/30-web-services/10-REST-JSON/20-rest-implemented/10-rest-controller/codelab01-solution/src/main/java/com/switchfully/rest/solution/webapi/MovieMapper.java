package com.switchfully.rest.solution.webapi;

import com.switchfully.rest.solution.domain.Movie;
import com.switchfully.rest.solution.webapi.dtos.CreateMovieDto;
import com.switchfully.rest.solution.webapi.dtos.MovieDto;

public class MovieMapper {

    public MovieDto mapToDTO(Movie savedMovie) {
        return new MovieDto()
                .setId(savedMovie.getId())
                .setTitle(savedMovie.getTitle())
                .setDescription(savedMovie.getDescription())
                .setRuntimeInSeconds(savedMovie.getRuntimeInSeconds());
    }

    public Movie mapToMovie(CreateMovieDto createMovieDto) {
        return new Movie(createMovieDto.getTitle(), createMovieDto.getDescription(), createMovieDto.getRuntimeInSeconds());
    }
}
