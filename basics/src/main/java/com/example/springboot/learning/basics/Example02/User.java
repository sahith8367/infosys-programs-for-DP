package com.example.springboot.learning.basics.Example02;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.boot.context.properties.bind.Name;

import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @JsonProperty("User_id ")
    private int id;
    @Size(min = 2,max = 15)
    private String name;
    @Past
    private LocalDateTime birthDay;
    public User(){}

    public User(int id, String name, LocalDateTime birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
