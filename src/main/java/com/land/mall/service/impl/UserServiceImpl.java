package com.land.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.land.mall.entity.User;
import com.land.mall.mapper.UserMapper;
import com.land.mall.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.TimeUnit;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User findUserByName(Map<String, Object> map) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",map.get("name"));
        return baseMapper.selectOne(wrapper);
    }

    @Override
    public void add(User user) {
        baseMapper.insert(user);
    }
}
