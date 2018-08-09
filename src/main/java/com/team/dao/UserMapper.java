package com.team.dao;

import com.team.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author 穿长裙的年代
 * 2018/8/6 10:55
 */
@Repository
public interface UserMapper {

//    @Insert("insert into user(name,age) values(#{name,jdbcType=String},#{age,jdbcType=Integer})")
//    public int insert(Users user);

    @Select("select * from users where user_id = #{userId}")
    @Results({
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_age",property = "userAge")
    })
    Users findOne(int userId);


}
