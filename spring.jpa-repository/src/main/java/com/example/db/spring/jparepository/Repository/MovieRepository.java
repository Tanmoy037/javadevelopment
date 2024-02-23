package com.example.db.spring.jparepository.Repository;

import com.example.db.spring.jparepository.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
    Movie findByName(String name);
}
