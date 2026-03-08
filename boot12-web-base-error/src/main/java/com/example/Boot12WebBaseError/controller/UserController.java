package com.example.Boot12WebBaseError.controller;

import com.example.Boot12WebBaseError.common.Result;
import com.example.Boot12WebBaseError.model.uservo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class UserController {
    @GetMapping("/detaile1")
    public String user1(Integer id){
        System.out.printf("用户id："+id);
        return "查询成功！";
    }

    //返回数据，响应ajax的请求

    @RequestMapping("/detaile2")
    public ResponseEntity<uservo> user(String id){
        uservo userModel=new uservo();
        userModel.setName("张开");
        userModel.setAge(54);
        userModel.setSex("女");

        if (id == null){
            throw new ArrayIndexOutOfBoundsException("id不能为空！");
        }
        return ResponseEntity.ok(userModel);
    }



}
