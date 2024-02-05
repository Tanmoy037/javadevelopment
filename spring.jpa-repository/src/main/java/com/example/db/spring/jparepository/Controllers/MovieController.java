package com.example.db.spring.jparepository.Controllers;

import com.example.db.spring.jparepository.Models.Movie;
import com.example.db.spring.jparepository.Service.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {


    @Autowired
    MovieServices movieServices;

    @GetMapping("/getMovies")
    public <Movie> getAllMovies(){

        movieServices.getAllMovies();

    }

    @PostMapping("/createMovie")
    public void createMovie(@RequestBody()Movie movie){

        
    }



}
