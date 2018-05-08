package com.ran.mapper;

import com.ran.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.mapper
 * @Description:
 * @date 2018/5/7 下午4:20
 */
@Component
public interface UserMapper {
    @Select("SELECT id, user_name, pass_word, user_sex, nick_name FROM users")
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(user_name, pass_word, user_sex, nick_name) VALUES(#{userName}, #{passWord}, #{userSex}, #{nickName})")
    void insert(UserEntity user);

    @Update("UPDATE users SET user_name=#{userName}, pass_word=#{passWord}, user_sex=#{userSex},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
