package com.example.RestApiProj2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
class UserRepository {

    HashMap<Integer,User> users = new HashMap<>();

    List<User> getAllUsersFromDatabase(){

        List<User> userList = new ArrayList<>();

        for (User user:users.values()){
            userList.add(user);
        }
        return userList;
    }

    void addUser(User user){

        users.put(user.getId(),user);
    }

}
