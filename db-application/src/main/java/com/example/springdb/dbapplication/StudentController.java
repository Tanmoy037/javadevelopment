package com.example.springdb.dbapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/getStudent")
    List<Student> getStudents(){

    }

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody() Student student){

    }

}
