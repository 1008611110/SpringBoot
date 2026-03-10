package com.example.Boot13WebApiVersion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Uservo {

    private String name;
    public Integer age;
    public String sex;

}