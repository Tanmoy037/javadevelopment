package com.example.RestApiController;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

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
        return users.get(id);
    }

    @PostMapping("/add_user")
    public void addUser(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("country")String country,@RequestParam("age")int age){


        User user = new User(id, name, country, age);
        users.put(id,user);
    }
    @PostMapping("add_user_body")
    public void addUser(@RequestBody(required = true)User user){
        users.put(user.getId(),user);
    }
    @PutMapping("modify_user")
    public User modifyUser(@RequestBody()User user){

        users.put(user.getId(),user);
        return user;
    }
    @DeleteMapping("/delete_user")
    public void deleteUser(@PathVariable("id")int id){
        users.remove(id);
    }


}
