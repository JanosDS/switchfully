package com.switchfully.rest.solution.domain;

import java.util.Objects;
import java.util.UUID;

public class Movie {

    private final String id;
    private String title;
    private String description;
    private int runtimeInSeconds;

    public Movie(String title, String description, int runtimeInSeconds) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.runtimeInSeconds = validateThatRuntimeIsHigherThanZero(runtimeInSeconds);
    }

    private int validateThatRuntimeIsHigherThanZero(int runtimeInSeconds) {
        if (runtimeInSeconds <= 0) {
            throw new IllegalArgumentException("The runtime of a movie needs to be higher than 0, " +
                    "the provided runtime of " + runtimeInSeconds + " is not");
        }
        return runtimeInSeconds;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRuntimeInSeconds(int runtimeInSeconds) {
        this.runtimeInSeconds = runtimeInSeconds;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRuntimeInSeconds() {
        return runtimeInSeconds;
    }

    public void changeRuntime(int runtimeInSeconds) {
        this.runtimeInSeconds = runtimeInSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return runtimeInSeconds == movie.runtimeInSeconds &&
                Objects.equals(id, movie.id) &&
                Objects.equals(title, movie.title) &&
                Objects.equals(description, movie.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, runtimeInSeconds);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", runtimeInSeconds=" + runtimeInSeconds +
                '}';
    }
}
