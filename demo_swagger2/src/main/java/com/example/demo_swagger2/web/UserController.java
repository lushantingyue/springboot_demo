package com.example.demo_swagger2.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @RequestMapping("/account")
    public String info() {
        return "<h2>account list</h2>";
    }
}
