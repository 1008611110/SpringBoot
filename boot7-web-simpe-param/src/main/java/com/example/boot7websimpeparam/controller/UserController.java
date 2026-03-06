package com.example.boot7websimpeparam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value ="/user/add")
    public String useradd(String name,Integer age){
        System.out.print("添加新用户");
        return "添加成功"+name+":"+age;
    }

}
