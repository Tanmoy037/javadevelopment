package com.example.RestApiProj2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    List<User> getAllUser(){

        return userRepository.getAllUsersFromDatabase();

    }

    void addUser(User user){

        userRepository.addUser(user);
    }

}
