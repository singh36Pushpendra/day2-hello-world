package com.hello.msg.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/param/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!!!";
    }
}
