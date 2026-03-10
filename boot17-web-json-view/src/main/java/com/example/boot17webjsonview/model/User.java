package com.example.boot17webjsonview.model;

import com.example.boot17webjsonview.views.UserView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class User {

    //   @JsonView() 对展示的json进行分组
    @JsonView({ UserView.UserSimpeView.class})
    private String Id;

    //@JsonIgnore  //忽略下方的字段
    @JsonView({ UserView.UserDetaile.class})
    private String Name;

    @JsonView({  UserView.UserSimpeView.class})
    @JsonProperty("account") //更改下方序列名字
    private String LoginAccount;

    @JsonView({ UserView.UserDetaile.class})
    private LocalDate Birthday;

    @JsonView({ UserView.UserSimpeView.class})
    private LocalDateTime CreatTime;
}
