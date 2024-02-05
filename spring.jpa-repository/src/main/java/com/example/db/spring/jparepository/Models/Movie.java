package com.example.db.spring.jparepository.Models;

public class Movie {

    String name;
    int time;
    double rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public double getRating() {
        return rating;
    }

    public Movie(String name, int time, double rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
    }
}
