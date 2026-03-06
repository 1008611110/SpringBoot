package com.example.boot6webviewhtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = {"/list","/show"},method = {RequestMethod.GET , RequestMethod.POST})
    public String userList(){
        System.out.println("进入");
        return "redirect:/User.html"; //redirect:浏览器重定向
    }



}
