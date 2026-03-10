package com.example.boot16webroleinterceptor.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin/index")
    public String admin1(){
        return "管理员界面";
    }
}
