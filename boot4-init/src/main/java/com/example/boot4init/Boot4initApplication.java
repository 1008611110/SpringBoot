package com.example.boot4init;

import com.example.boot4init.molde.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.annotation.Order;

//在一个配置类(@Configuration) 实现 ApplicationRunner 或 CommendLineRunner 接口
@EnableConfigurationProperties(student.class)

@Order(2)
@SpringBootApplication
public class Boot4initApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>启动springboot开始执行");
        SpringApplication.run(Boot4initApplication.class, args);
        System.out.println(">>>>>>>>>启动springboot run()之后");
    }

    @Override
    public void run(String... args) throws Exception {
        for (String arg : args) {
            System.out.println("命令行参数 "+arg);
        }
        System.out.println("执行springboot创建后，执行从数据库读取数据，缓存起来" + args[0]);
    }
}
