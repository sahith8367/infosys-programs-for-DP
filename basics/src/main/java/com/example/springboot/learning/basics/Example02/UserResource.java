package com.example.springboot.learning.basics.Example02;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
public class UserResource {
    static List<User> list = new ArrayList<>();
    static{
        list.add(new User(1,"Sahith", LocalDateTime.now().minusYears(24)));
        list.add(new User(2,"Sahith", LocalDateTime.now().minusYears(24)));
        list.add(new User(3,"Sahith", LocalDateTime.now().minusYears(24)));
        list.add(new User(4,"Sahith", LocalDateTime.now().minusYears(24)));
        list.add(new User(5,"Sahith", LocalDateTime.now().minusYears(24)));
        list.add(new User(6,"Sahith", LocalDateTime.now().minusYears(24)));
        list.add(new User(7,"Sahith", LocalDateTime.now().minusYears(24)));
    }

    public List<User> findAll(){
        return list;
    }
}
