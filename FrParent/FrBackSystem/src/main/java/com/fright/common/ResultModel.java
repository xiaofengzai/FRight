package com.fright.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by szty on 2018/6/19.
 */
@ApiModel(value = "接口返回统一对象")
public class ResultModel<T>{
    @ApiModelProperty(value = "状态码")
    private int code = 1;
    @ApiModelProperty(value = "错误信息")
    private String message;
    @ApiModelProperty(value = "成功时返回的对象")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccessed() {
        return code == 1;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ResultModel SuccessResult(){
        return new ResultModel();
    }

    public static <T> ResultModel<T> SuccessResult(T data){
        ResultModel<T> result = new ResultModel<>();
        result.setData(data);
        return result;
    }

    public static <T> ResultModel Fail(String message, int code, T data){
        ResultModel result =new ResultModel<T>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static ResultModel Fail(String message){
        return Fail(message,-1,null);
    }

    public static ResultModel Fail(String message, int code){
        return Fail(message,code,null);
    }
}
