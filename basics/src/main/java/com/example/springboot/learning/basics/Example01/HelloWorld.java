package com.example.springboot.learning.basics.Example01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("hello-world")
    public String helloWorld(){
        return "Hello !! Wellcome To Java";
    }
    @GetMapping("/welcome")
    public String person(){
        return "Name : Chintala Sahith";
    }
    //EntityModel
    //WebMvcLinkBuilder

}
