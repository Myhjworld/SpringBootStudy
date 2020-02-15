package com.example.demo.controller;

import  org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/Hello")
    public  String Hello(){
        return  "Hello SpringBoot!";
    }
}
