package com.example.demo_spring;

import com.example.demo_spring.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class MoreInfoController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/moreInfo")
    public String info() {
        return configBean.getGreeting() + ">>> " +
                configBean.getName() + ">>> " +
                configBean.getUuid() + ">>> " +
                configBean.getMax();
    }
}
