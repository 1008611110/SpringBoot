package com.example.Boot14WebApiVersion2.controller;

import com.example.Boot14WebApiVersion2.model.Uservo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping(value = "users",version = "1.0")
    public ResponseEntity<Uservo> listuserv1(){
        Uservo uservo=new Uservo("张三",32,"女");
        return ResponseEntity.ok(uservo);

    }

    @RequestMapping(value = "/users",version = "2.0")
    public ResponseEntity<Uservo> listuserv2(){
        Uservo uservo=new Uservo("张s",32,"男");
        return ResponseEntity.ok(uservo);

    }



}
