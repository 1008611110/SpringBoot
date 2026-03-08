package com.example.Boot12WebBaseError.exception;

import com.example.Boot12WebBaseError.common.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestAttributes;

import java.net.URI;

@RestControllerAdvice
public class GlobaExceptionHandler {


    /*
           @ExceptionHandler异常处理注解，绑定异常处理和方法
        */
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public Result<String> headleExcep(Exception e){
        //e是运行期间controller中抛出的异常对象，根据异常类执行不同的处理逻辑
        return Result.fail("1000","服务器异常");
    }
    //只要是RuntimeException和他的子类异常都是当前方法处理的
    @ExceptionHandler(RuntimeException.class)
    public Result<String> headleExcep2(Exception e){
        return Result.fail("502","服务器异常,请稍后重试!");
    }

    //ProblemDetail：统一错误对象
   @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
   public ResponseEntity<ProblemDetail> handleExcep3(HttpServletRequest request){
        ProblemDetail problemDetail=ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle("数组越界");
        problemDetail.setDetail("访问数组不在范围内");
        problemDetail.setInstance( URI.create(request.getRequestURI()));
        //自定义属性和值
       problemDetail.setProperty("errcode","VALIDATE_001");
       return  ResponseEntity.badRequest().body(problemDetail);
   }

}
