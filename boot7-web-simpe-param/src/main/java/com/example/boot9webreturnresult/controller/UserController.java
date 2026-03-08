package com.example.boot9webreturnresult.controller;

import com.example.boot9webreturnresult.model.UserModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UserController {

    @RequestMapping(value ="/user/add")
    public String useradd(String name,Integer age){
        System.out.print("添加新用户");
        return "添加成功"+name+":"+age;
    }

    @RequestMapping(value = "/user/myfile")
    public String userfile(@RequestParam("myfile") MultipartFile multipartFile){
        System.out.print("上传成功！！！");
        return "上传成功!";
    }
    @RequestMapping(value = "/user/object")
    public String userobject(UserModel userModel){
        System.out.printf("接收对象成功!");
        return  "姓名："+userModel.getName()+"性别："+userModel.getSex()+"年龄："+userModel.getAge();

    }
    @PostMapping("user/json")
    public String userjson(@RequestBody UserModel userModel){
        System.out.printf("json添加新用户"+userModel.toString());
        return "添加成功:"+userModel.getName();
    }



}
