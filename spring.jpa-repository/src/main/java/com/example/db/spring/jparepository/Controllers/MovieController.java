package com.example.db.spring.jparepository.Controllers;

import com.example.db.spring.jparepository.Models.Movie;
import com.example.db.spring.jparepository.Service.MovieServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private static final Logger log = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    MovieServices movieServices;

    @GetMapping("/getMovies")
    private List<Movie> getAllMovies() {
        try {
            log.info("Endpoint called: GET /getMovies");
            return movieServices.getAllMovies();
        } catch (Exception e) {
            log.error("Error occurred while fetching movies", e);
            throw new RuntimeException("Failed to fetch movies");
        }
    }

    @PostMapping("/createMovie")
    public void createMovie(@RequestBody Movie movie) {
        try {
            log.info("Endpoint called: POST /createMovie");
            movieServices.createMovie(movie);
        } catch (Exception e) {
            log.error("Error occurred while creating movie", e);
            throw new RuntimeException("Failed to create movie");
        }
    }

    @PutMapping("/updateMovie")
    public void updateMovie(@RequestBody Movie movie) {
        try {
            log.info("Endpoint called: PUT /updateMovie");
            movieServices.updateMovie(movie);
        } catch (Exception e) {
            log.error("Error occurred while updating movie", e);
            throw new RuntimeException("Failed to update movie");
        }
    }

    @DeleteMapping("/deleteMovie")
    public void deleteMovieByName(@RequestBody Movie movie) {
        try {
            log.info("Endpoint called: DELETE /deleteMovie");
            movieServices.deleteMovieByName(movie);
        } catch (Exception e) {
            log.error("Error occurred while deleting movie", e);
            throw new RuntimeException("Failed to delete movie");
        }
    }
}
