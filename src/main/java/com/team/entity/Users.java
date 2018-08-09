package com.team.entity;

import lombok.Data;

/**
 * @author 穿长裙的年代
 * 2018/8/6 11:15
 */
@Data
public class Users {

    /** 主键. */
    private int userId;

    /** 用户名. */
    private String userName;

    /** 年龄. */
    private int userAge;

}
