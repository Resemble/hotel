package com.ran.service;

import com.ran.entity.UserEntity;
import com.ran.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.service
 * @Description:
 * @date 2018/5/7 下午5:50
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    public void update(UserEntity user) {
        userMapper.update(user);
    }

    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}
