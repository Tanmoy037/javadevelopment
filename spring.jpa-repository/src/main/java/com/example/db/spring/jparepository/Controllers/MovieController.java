package com.example.db.spring.jparepository.Controllers;

import com.example.db.spring.jparepository.Models.Movie;
import com.example.db.spring.jparepository.Service.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {


    @Autowired
    MovieServices movieServices;

    @GetMapping("/getMovies")
    private List<Movie> getAllMovies(){

        return movieServices.getAllMovies();

    }



    @PostMapping("/createMovie")
    public void createMovie(@RequestBody()Movie movie){

        movieServices.createMovie(movie);
    }
    @PutMapping("/updateMovies")
    public void updateMovie(@RequestBody()Movie movie){

        movieServices.updateMovie(movie);
    }

    @DeleteMapping("/deleteMovie")
    public void deleteMovieByName(@RequestBody()Movie movie){
        movieServices.deleteMovieByName(movie);
    }




}
