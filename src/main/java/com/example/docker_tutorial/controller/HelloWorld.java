package com.example.docker_tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World-2";
    }
}
