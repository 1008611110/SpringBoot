package com.example.demo.controller;

import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class ReadFileController {
    @Resource
    private Environment env;


    @GetMapping("/readenv")
    public String readEnv(){
        String appName = env.getProperty("spring.application.name");
        String str = "学习： " + appName;
        return  str;
    }
}

