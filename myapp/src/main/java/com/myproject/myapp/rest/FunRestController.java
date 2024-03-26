package com.myproject.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


//    inject property for name
    @Value("${team.name}")
    String name;

    @GetMapping
    public String sayHello(){
        return name;
    }

    @GetMapping("/dummy")
    public String sayDummy(){
        return "dummy";
    }
}
