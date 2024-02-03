package com.example.springdb.dbapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    DBManager dbManagerObj;

    @GetMapping("/getStudent")
    List<String> getStudents() throws SQLException {

        return dbManagerObj.getInfo();

    }

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody() Student student) throws SQLException {

        //add into the DB

        dbManagerObj.insertInfo(student);

    }

}
