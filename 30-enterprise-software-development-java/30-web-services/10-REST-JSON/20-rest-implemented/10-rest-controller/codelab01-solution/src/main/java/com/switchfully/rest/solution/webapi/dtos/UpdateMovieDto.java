package com.switchfully.rest.solution.webapi.dtos;

/**
 * DTOs are simple objects that should not contain any business logic but may contain get, set, serialization and
 * deserialization mechanisms for transferring data "over the wire" (e.g. HTTP)
 */
public class UpdateMovieDto {

    private String title;
    private String description;
    private int runtimeInSeconds;

    public String getTitle() {
        return title;
    }

    public UpdateMovieDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateMovieDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getRuntimeInSeconds() {
        return runtimeInSeconds;
    }

    public UpdateMovieDto setRuntimeInSeconds(int runtimeInSeconds) {
        this.runtimeInSeconds = runtimeInSeconds;
        return this;
    }
}
