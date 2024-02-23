package com.example.db.spring.jparepository.Service;

import ch.qos.logback.classic.util.LogbackMDCAdapter;
import com.example.db.spring.jparepository.Models.Movie;
import com.example.db.spring.jparepository.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServices {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void createMovie(Movie movie) {

        movieRepository.save(movie);

    }

    public void updateMovie(Movie movie) {
        Movie existingMovie = movieRepository.findByName(movie.getName());
        if (existingMovie != null) {
            existingMovie.setTime(movie.getTime());
            existingMovie.setRating(movie.getRating());
            movieRepository.save(existingMovie);
        }
    }
    public void deleteMovieByName(Movie movie){
        movieRepository.deleteById(movie.getName());
    }

}