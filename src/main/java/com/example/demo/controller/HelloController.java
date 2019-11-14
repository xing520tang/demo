package com.example.demo.controller;

import com.example.demo.controller.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author tinyspot
 * @Time 2019/11/14-19:30
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){

        return "hello demo!";
    }

    @GetMapping("/hello1")
    public Map<String, String> hello1(){

        return helloService.getMap();
    }
}
