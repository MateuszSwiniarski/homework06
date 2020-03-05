package com.rodzyn.homework06.controller;

import com.rodzyn.homework06.model.Movie;
import com.rodzyn.homework06.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieApi {

    private MovieService movieService;

    @Autowired
    public MovieApi(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies(){
        return movieService.getMovieList();
    }

    @SendMail
    @PostMapping
    public boolean addMovie(@RequestBody Movie movie){
        return movieService.getMovieList().add(movie);
    }
}
