package com.example.RestApiProj2;

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


    @GetMapping()
    List<User> getAllUsers(){
        List<User>listOfUsers = new ArrayList<>();

        for(User user:users.values()){
            listOfUsers.add(user);

        }
        return listOfUsers;
    }

    @PostMapping("/add_user_body")
    String addUser(@RequestBody()User user){

        users.put(user.getId(),user);

        return "Successfully Added";
    }

}
