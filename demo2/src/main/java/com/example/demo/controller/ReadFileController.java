package com.example.demo.controller;

import jakarta.annotation.Resource;
import model.Student;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class ReadFileController {

    @Resource
    private Student student;


    @GetMapping("/readenv")
    public String readEnv(){

        return student.toString();
    }
}

