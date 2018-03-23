package com.example.demo_spring.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    private String name = "<h1>Springboot Demo \n </h1>";

    /**
     * 主页路径
     * @return
     */
    @RequestMapping("/")
    private String home() {
        return "<h1>Index\n</h1>";
    }

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
