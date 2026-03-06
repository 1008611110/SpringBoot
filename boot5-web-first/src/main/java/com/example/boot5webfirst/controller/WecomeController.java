package com.example.boot5webfirst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WecomeController {

    @GetMapping("/myweb")
    public String wecome(){
        return  "欢迎来到Springboot" ;
    }
}
