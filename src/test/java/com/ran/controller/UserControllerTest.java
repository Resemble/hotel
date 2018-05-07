package com.ran.controller;

import com.ran.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.controller
 * @Description:
 * @date 2018/5/7 下午6:05
 */@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired UserController userController;


    @Test public void getUsers() {
        System.out.println(userController.getUsers());
    }

    @Test public void getUser() {
        System.out.println(userController.getUser(2L));
    }

    @Test public void save() {
        UserEntity userEntity = new UserEntity( 4L, "name4", "pass4", "man", "nickname4");
        userController.save(userEntity);
    }

    @Test public void update() {
        UserEntity userEntity = new UserEntity( 28L, "name4-update", "pass4-update", "man", "nickname4");
        userController.update(userEntity);
    }

    @Test public void delete() {
        userController.delete(28L);
    }
}
