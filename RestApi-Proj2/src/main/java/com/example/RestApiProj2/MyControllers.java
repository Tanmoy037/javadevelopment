package com.example.RestApiProj2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
class MyControllers {

    HashMap<Integer,User> users = new HashMap<>();


    @GetMapping("/get_users")
    ResponseEntity<List<User>> getAllUsers(){
        List<User>listOfUsers = new ArrayList<>();

        for(User user:users.values()){
            listOfUsers.add(user);

        }
        return new ResponseEntity<>(listOfUsers, HttpStatus.OK);
    }

    @PostMapping("/add_user_body")
    ResponseEntity<String> addUser(@RequestBody()User user){

        users.put(user.getId(),user);

        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }

}
