package com.aaron.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_World {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
