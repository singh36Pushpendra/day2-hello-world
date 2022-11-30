package com.hello.msg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"/", "/world", "/msg"})
    public String hello() {
        return "Hello from Bridgelabs!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
