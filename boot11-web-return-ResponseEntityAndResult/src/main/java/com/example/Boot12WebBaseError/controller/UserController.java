package com.example.Boot12WebBaseError.controller;

import com.example.Boot12WebBaseError.model.uservo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class UserController {
    @RequestMapping("/detail")
    public ResponseEntity<uservo> user(String id){
        uservo userModel=new uservo();
        userModel.setName("张毅");
        userModel.setAge(54);
        userModel.setSex("女");
        return ResponseEntity.ok(userModel);
    }

    @GetMapping("/res")
    public ResponseEntity<String> user1(String id){
        if(id == null){
           return ResponseEntity.badRequest().body("id不能为空");
        } else if (!id.equals("1")) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("权限不足");
        }
        else {
           return ResponseEntity.ok().body("访问成功");
        }
    }

    @GetMapping("/res1")
    public ResponseEntity<com.example.Boot12WebBaseError.common.Result<uservo>> user2(String id){
        uservo userVo=new uservo();
        userVo.setAge(12);
        userVo.setName("王正");
        userVo.setSex("女");

        //创建响应header
        HttpHeaders headers = new HttpHeaders();
        headers.add("Token", "130133");
        headers.add("X-Request-ID", "12eqwe1edqe1");
        return new ResponseEntity<>(new com.example.Boot12WebBaseError.common.Result<uservo>("1000","查询成功"), headers, HttpStatus.OK);
    }




}
