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

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void createMovie(Movie movie){

        movieRepository.save(movie);

    }

    public void updateMovie(Movie movie){
        Movie existingMovie = movieRepository.findByName(movie.getName());

        // Check if the existing movie is not null
        if (existingMovie != null) {
            // Update the existing movie with the new values
            existingMovie.setTime(movie.getTime());
            existingMovie.setRating(movie.getRating());

            // Save the changes into the persistence context
            movieRepository.save(existingMovie);
    }
}
