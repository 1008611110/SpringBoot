package com.example.Boot15WebApiVersion3.controller;

import com.example.Boot15WebApiVersion3.model.Uservo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping(value = "/api/users",version = "v1")
    public ResponseEntity<Uservo> listuserv1(){
        Uservo uservo=new Uservo("张三",32,"女");
        return ResponseEntity.ok(uservo);

    }

    @RequestMapping(value = "/api/users",version = "v2")
    public ResponseEntity<Uservo> listuserv2(){
        Uservo uservo=new Uservo("张s",32,"男");
        return ResponseEntity.ok(uservo);

    }



}
