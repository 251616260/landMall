package com.land.mall.utils;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private Long total;
    private T data;

    public static<T> Result<T> success(T data){
        Result<T> result = new Result<>();
        if(data!=null) result.setData(data);

        result.setCode(200);
        result.setMsg("成功");
        return result;
    }

    public static<T> Result<T> success(Integer code,String msg){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> success(T data,Long total){
        Result<T> result = new Result<>();
        if(data!=null) result.setData(data);

        result.setCode(200);
        result.setMsg("成功");
        result.setTotal(total);
        return result;
    }

    public static<T> Result<T> error(Integer code,String msg){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static<T> Result<T> error(T data,Integer code,String msg){
        Result<T> result = new Result<>();
        if(data != null) {
            result.setData(data);
        }
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public Result<T> msg(String msg){
        this.setMsg(msg);
        return this;
    }
    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
}
