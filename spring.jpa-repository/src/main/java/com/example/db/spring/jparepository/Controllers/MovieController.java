package com.example.db.spring.jparepository.Controllers;

import com.example.db.spring.jparepository.Models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/getMovies")
    List<Movie> getAllMovies(){


    }

}
