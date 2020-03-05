package com.rodzyn.homework06.service;

import com.rodzyn.homework06.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImp implements MovieService{

    private List<Movie> movieList = new ArrayList<>();


    public MovieServiceImp() {
        movieList.add(new Movie("The Shed", 2019, "Drama"));
        movieList.add(new Movie("Bad Boys for Life", 2020, "Comedy"));
        movieList.add(new Movie("Adopt a Highway", 2019, "Drama"));
    }

    @Override
    public List<Movie> getMovieList(){
        return movieList;
    }

    @Override
    public boolean addMovie(Movie movie){
        System.out.println(movie);
        return getMovieList().add(movie);
    }

}
