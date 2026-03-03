package com.example.boot4init.controller;

import com.example.boot4init.molde.student;
import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Resource
    private student student;

    @Resource
    private Environment env;


    @GetMapping("/profile")
    public String getProfileInfo(){
        String[] activeProfiles = env.getActiveProfiles();
        for(String activeProfile : activeProfiles){
            System.out.println(activeProfile);
        }
        return "当前环境是："+student.getName()+"年龄是："+student.getAge();
    }
}
