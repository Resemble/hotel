package com.ran.service;

import com.ran.entity.UserEntity;
import com.ran.mapper.UserMapper;
import com.ran.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired private PasswordUtil passwordUtil;

    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    public void save(UserEntity user) {
        user.setPassWord(passwordUtil.generate(user.getPassWord()));
        userMapper.insert(user);
    }

    public void update(UserEntity user) {
        // 密码改盐加密，没改旧盐加密
        String newPassWord = user.getPassWord();
        String oldPassWord = getUser(user.getId()).getPassWord();
        if(newPassWord.equals(oldPassWord)) {
            userMapper.update(user);
        } else {
            user.setPassWord(passwordUtil.generate(newPassWord));
            userMapper.update(user);
        }
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}
