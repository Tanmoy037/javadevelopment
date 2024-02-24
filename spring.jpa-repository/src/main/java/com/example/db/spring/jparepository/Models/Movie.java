package com.example.db.spring.jparepository.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie_db")
public class Movie {

    @Id
    private String name;

    @Column(name = "duration_of_movie")
    private int time;
    private double rating;

    // Default constructor
    public Movie() {
        // Default values or initialization can be done here if needed
    }

    // Parameterized constructor
    public Movie(String name, int time, double rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
