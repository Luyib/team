package com.team.service;

import com.team.entity.Users;
import org.springframework.stereotype.Service;

/**
 * @author 穿长裙的年代
 * 2018/8/7 20:34
 */
public interface UserService {

    /** 根据id查询用户. */
    Users findOne(int id);
}
