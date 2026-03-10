package com.example.Boot15WebApiVersion3.config;


import org.jspecify.annotations.NonNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
    实现WebMvcConfigurer这个接口,配置spingMvc模块。 全局配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configureApiVersioning(@NonNull ApiVersionConfigurer configurer){
        //告诉spingboot在哪里获取版本信息的值
        //自定义参数 ver ，ver的值就是版本信息，如:v1 v2
        configurer.useQueryParam("ver");
    }

}
