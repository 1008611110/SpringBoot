package com.example.boot9webreturnresult.controller;

import com.example.boot9webreturnresult.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping("/detail")
    public UserModel userobject(String id){
        UserModel userModel=new UserModel();
        userModel.setName("张四");
        userModel.setAge(54);
        userModel.setSex("女");
        return userModel;
    }



}
