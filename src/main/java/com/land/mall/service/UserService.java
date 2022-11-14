package com.land.mall.service;

import com.land.mall.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;


public interface UserService extends IService<User> {

    User findUserByName(Map<String, Object> map);

    void add(User user);
}
