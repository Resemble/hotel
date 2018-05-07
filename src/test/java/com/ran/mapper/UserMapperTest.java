package com.ran.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.mapper
 * @Description:
 * @date 2018/5/7 下午4:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test public void getAll() {
        System.out.println(userMapper.getAll());
    }
}
