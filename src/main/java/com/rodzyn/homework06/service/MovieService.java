package com.rodzyn.homework06.service;

import com.rodzyn.homework06.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMovieList();
    boolean addMovie(Movie movie);
}
