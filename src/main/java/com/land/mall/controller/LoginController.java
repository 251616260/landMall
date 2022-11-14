package com.land.mall.controller;

import com.land.mall.entity.User;
import com.land.mall.service.UserService;
import com.land.mall.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Api(value = "登录模块")
@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    private UserService userService;

    @ApiOperation("登录接口")
    @RequestMapping("/validLogin")
    public Result<?> validLogin(@RequestBody User u,
                                HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("name",u.getUserName());
        User user = userService.findUserByName(map);

        if(user.getPassWord().equals(u.getPassWord())){
            request.getSession().setAttribute("user",user);

            return Result.success(u);
        }else{
            return Result.error(201,"登录失败");
        }
    }
}
