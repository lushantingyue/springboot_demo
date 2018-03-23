package com.example.demo_spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    private String name = "<h1>Springboot Demo \n </h1>";

    @RequestMapping("/demo")
    private String demo() {
        return "<h1>Welcome to SpringBoot's World!\n </h1>";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hello " + myName + "!!!";
    }

    @RequestMapping("/app")
    private String name() {
        return name;
    }

}
