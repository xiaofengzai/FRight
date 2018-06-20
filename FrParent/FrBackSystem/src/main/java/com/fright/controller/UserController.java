package com.fright.controller;

import com.fright.common.ResultModel;
import com.fright.model.sys.SysUser;
import com.fright.repository.UserRepository;
import com.fright.viewmodel.UserRegisterRequest;
import com.fright.viewmodel.UserViewModel;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by szty on 2018/6/19.
 */
@RestController
@RequestMapping("/users")
@Api(value = "用户管理接口")
class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // 路由映射到/users
    @GetMapping(value = "")
    public ResultModel<List<UserViewModel>> usersList() {
        return ResultModel.SuccessResult(Arrays.asList(new UserViewModel("wen",23),new UserViewModel("feng",21)));
    }

    @PostMapping("/signup")
    public ResultModel signUp(@RequestBody UserRegisterRequest request) {
        SysUser user=new SysUser(request.getUsername(),bCryptPasswordEncoder.encode(request.getPassword()));
        userRepository.save(user);
        return ResultModel.SuccessResult();
    }
}