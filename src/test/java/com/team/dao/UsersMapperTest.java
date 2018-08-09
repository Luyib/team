package com.team.dao;

import com.team.entity.Users;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 穿长裙的年代
 * 2018/8/7 21:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void findOne() throws Exception {
        Users result = mapper.findOne(1);
        Assert.assertNotNull(result);
    }

}