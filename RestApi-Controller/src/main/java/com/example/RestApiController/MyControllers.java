package com.example.RestApiController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // Annotation --> In this class I will write the APIs
public class MyControllers {

    //DB Purpose
    HashMap<Integer,User> users = new HashMap<>();

    @GetMapping("/get_users")
    public List<User> getAllUser(){
        //Server side logic
        List<User> listOfUsers = new ArrayList<>();

        for(User user : users.values()){
            listOfUsers.add(user);
        }

//        for(Map.Entry<Integer,User> entry:users.entrySet()){
//
//           listOfUsers.add(entry.getValue());
//
//
//        }
        return listOfUsers;

    }
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id")int id){

    }



}
