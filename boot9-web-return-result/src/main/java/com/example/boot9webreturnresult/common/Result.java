package com.example.boot9webreturnresult.common;

//统一应答结果类
public class Result<T> {
    private String code;  //自定义应答码
    private String meg;   //应答说明
    private T data;

    public Result( ){
    }

    public Result(String code,String meg ){
        this.code =code;
        this.meg = meg;
    }

    public Result(String code,String meg , T data){
        this.code =code;
        this.meg = meg;
        this.data = data;
    }

    //创造工具方法
     public static Result<String> success(){
        return new Result<String>("200","操作成功","");
     }

    public static <T> Result<T> success(T data){
        return new Result<T>("200","操作成功",data);
    }

    public static Result<String> fail(String code,String meg){
        return new Result<String>(code,meg,"");
    }

    public String getCode() {
        return code;
    }

    public String getMeg() {
        return meg;
    }

    public T getData() {
        return data;
    }
}
