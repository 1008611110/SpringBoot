package com.example.boot17webjsonview.controller;

import com.example.boot17webjsonview.model.User;
import com.example.boot17webjsonview.views.UserView;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@JsonView
public class UserController {
    @GetMapping("/user/deta")
    public User users(){
        User user=new User();
        user.setId("1001");
        user.setName("王五");
        user.setLoginAccount("wangwu");
        user.setBirthday(LocalDate.of(2002,2,2) );
        user.setCreatTime(LocalDateTime.now());
        return user;
    }

    @GetMapping("/user/detaile")
    @JsonView({ UserView.UserDetaile.class})
    public User userdetail(){
        User user=new User();
        user.setId("1002");
        user.setName("李四detaile");
        user.setLoginAccount("lisi");
        user.setBirthday(LocalDate.of(2202,4,2) );
        user.setCreatTime(LocalDateTime.now());
        return user;
    }

    @GetMapping("/user/simp")
    @JsonView({ UserView.UserSimpeView.class})
    public User usersimp(){
        User user=new User();
        user.setId("1003");
        user.setName("小二simp");
        user.setLoginAccount("xiaoer");
        user.setBirthday(LocalDate.of(2012,6,2) );
        user.setCreatTime(LocalDateTime.now());
        return user;
    }
}
