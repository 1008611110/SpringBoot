package com.example.boot4init.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class RedisInitCach implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>>>>>使用ApplicationRunner接口" + args.getNonOptionArgs().get(0));
    }
}
