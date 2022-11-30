package com.hello.msg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"/", "/world", "/msg"})
    public String hello() {
        return "Hello from Bridgelabs!";
    }
}
