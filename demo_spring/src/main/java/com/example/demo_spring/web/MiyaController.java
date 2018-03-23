package com.example.demo_spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    /**
     * 读取application.yml 中自定义的配置信息
     * @return
     */
    @RequestMapping(value = "/info")
    public String info() {
        return name + ":" + age;
    }
}
