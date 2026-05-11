package com.example.springboot.learning.basics.Example02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServices {
    @Autowired
    private UserResource services;
    @GetMapping("/users")
    public List<User> findUser(){
        return services.findAll();
    }
}
