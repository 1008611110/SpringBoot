package com.example.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/hello")
    public String Welcome(){
        return "欢迎1";
    }
}
