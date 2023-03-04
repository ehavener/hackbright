package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {
    @Autowired
    public BestMovieService(@Qualifier("batmanMovie") Movie movie) {
        this.movie = movie;
    }

    private Movie movie;

    public Movie getBestMovie() {

        return movie;
    }
}
