package com.example.demo_spring.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 定义加载配置信息的 数据Bean
 */
@ConfigurationProperties(prefix = "my")
@Component
public class ConfigBean {

    private String name;
    private int age;
    private int num;
    private String uuid;
    private int max;
    private String value;
    private String greeting;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNum() {
        return num;
    }

    public String getUuid() {
        return uuid;
    }

    public int getMax() {
        return max;
    }

    public String getValue() {
        return value;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
