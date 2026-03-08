package com.example.boot9webreturnresult.controller;

import com.example.boot9webreturnresult.common.Result;
import com.example.boot9webreturnresult.model.uservo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @RequestMapping("/detail")
    public Result<uservo> userobject(String id){
        uservo userModel=new uservo();
        userModel.setName("王二");
        userModel.setAge(54);
        userModel.setSex("女");
        return Result.success(userModel);
    }
    @RequestMapping("/map")
    public Result<Map<String,uservo>> userobjectMap(String id){
        uservo userModel=new uservo();
        userModel.setName("张三");
        userModel.setAge(54);
        userModel.setSex("女");

        uservo userModel1=new uservo();
        userModel1.setName("李四");
        userModel1.setAge(23);
        userModel1.setSex("男");

        Map<String,uservo> usermodelmap=new HashMap<>();
        usermodelmap.put("user1",userModel);
        usermodelmap.put("user2",userModel1);
        return Result.success(usermodelmap);
    }
    @RequestMapping("/list")
    public Result<List<uservo>> userobjectList(String id){
        uservo userModel=new uservo();
        userModel.setName("张三");
        userModel.setAge(54);
        userModel.setSex("女");

        uservo userModel1=new uservo();
        userModel1.setName("李四");
        userModel1.setAge(23);
        userModel1.setSex("男");

        return Result.success(List.of(userModel,userModel1));
    }




}
