package com.example.springboot.learning.basics.Example01;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class PersonVersioning {

    @GetMapping("/v1/person")
    public PersonV1 personV1(){
        return new PersonV1("Sahith");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Chintala","Sahith"));
    }

    @GetMapping("/hateoas-person")
    public EntityModel<PersonV1> retriveData(){
        PersonV1 person1 = new PersonV1("Chintala Sahith");
        PersonV2 person = new PersonV2(new Name ("Sahith","Chintala"));
        EntityModel<PersonV1> entityModel = EntityModel.of(person1);
        entityModel.add();
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).personV1());
        entityModel.add(link.withRel("Another-Person"));
        return entityModel;
    }
}
