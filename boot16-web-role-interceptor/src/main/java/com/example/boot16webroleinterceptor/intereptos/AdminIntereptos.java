package com.example.boot16webroleinterceptor.intereptos;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class AdminIntereptos implements HandlerInterceptor {

    //前置拦截器
    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //验证role是否为admin
        String role=request.getParameter("role");
        String uil=request.getRequestURI();
        if("admin".equals(role) && "/admin/index".equals(uil)){
            return true;  //role为管理员  放行
        }else{
            return false;
        }
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.printf("此处为后置处理器！");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.printf("此处为afterCompletion！");
    }
}
