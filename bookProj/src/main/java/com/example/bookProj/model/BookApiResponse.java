package com.example.bookProj.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class BookApiResponse {

    private int statusCode;
    private boolean success;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Book> data;

    // Constructors, getters, and setters

    public BookApiResponse(int statusCode, boolean success, String message, List<Book> data) {
        this.statusCode = statusCode;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // Getters and setters...

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Book> getData() {
        return data;
    }

    public void setData(List<Book> data) {
        this.data = data;
    }
}
