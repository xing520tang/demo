package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tinyspot
 * @Time 2019/11/14-19:30
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello demo!";
    }
}
