package com.land.mall.controller;


import com.land.mall.entity.User;
import com.land.mall.service.UserService;
import com.land.mall.utils.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@Api(value = "用户模块")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("")
    public Result<?> add(@RequestBody User user){
        userService.add(user);
        return Result.success(null,"注册成功");
    }

}

