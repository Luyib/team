package com.team.service.impl;

import com.team.dao.UserMapper;
import com.team.entity.Users;
import com.team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 穿长裙的年代
 * 2018/8/7 21:13
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users findOne(int id) {

        return userMapper.findOne(id);
    }
}
