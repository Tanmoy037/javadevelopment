package com.example.RestApiProj2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class MyControllers {


    @Autowired
    UserService userService;

    @GetMapping("/get_users")
    ResponseEntity<List<User>> getAllUsers(){
        List<User>listOfUsers = new ArrayList<>();

        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
    }

    @PostMapping("/add_user_body")
    ResponseEntity<String> addUser(@RequestBody()User user){
        try{
            userService.addUser(user);
            return new ResponseEntity<>("Success",HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }


    }

}
