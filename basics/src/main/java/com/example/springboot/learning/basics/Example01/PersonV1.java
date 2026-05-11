package com.example.springboot.learning.basics.Example01;

import jakarta.persistence.Entity;


public class PersonV1 {
    private String Name;
    public PersonV1(){}
    public PersonV1(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
