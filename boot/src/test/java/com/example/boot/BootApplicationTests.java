package com.example.boot;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;


@SpringBootTest
class BootApplicationTests {
    @Resource
    private ApplicationContext ctx;


    @Test
    void name() {
    }
}
