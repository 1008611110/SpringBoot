package com.example.boot16webroleinterceptor.config;

import com.example.boot16webroleinterceptor.intereptos.AdminIntereptos;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Resource
    private AdminIntereptos adminIntereptos;

    private static final String[] EXCLUDE_PATH = {"/", "/index", "/login", "/css/**", "/js/**", "/fonts/**", "/img/**", "/error"};
    private static final String[] INCLUDE_PATH = {"/**"};

    //添加拦截器，指定拦截的url请求
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       //通过形参，添加拦截器到系统
        registry.addInterceptor(adminIntereptos)
                .addPathPatterns(INCLUDE_PATH) //拦截器拦截的uri
                .excludePathPatterns(EXCLUDE_PATH);//拦截器不拦截的uri


    }
}