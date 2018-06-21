package com.fright.controller;

import com.fright.common.ResultModel;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * Created by szty on 2018/6/21.
 */
public class BaseController {
    protected ResultModel ValidateFailResult(BindingResult result) {
        FieldError fieldError = result.getFieldErrors().get(0);
        return ResultModel.Fail(fieldError.isBindingFailure() ? fieldError.getField() + "参数类型错误！" : fieldError.getDefaultMessage(), 100);
    }
}
