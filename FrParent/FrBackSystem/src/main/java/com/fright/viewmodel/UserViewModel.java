package com.fright.viewmodel;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by szty on 2018/6/20.
 */
@ApiModel
@Data
@AllArgsConstructor
public class UserViewModel {
    private String name;
    private Integer age;
}
