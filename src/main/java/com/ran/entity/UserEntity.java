package com.ran.entity;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.entity
 * @Description:
 * @date 2018/5/7 下午4:19
 */
public class UserEntity {

    private Long id;
    private String userName;
    private String passWord;
    private String userSex;
    private String nickName;


    public UserEntity(Long id, String userName, String passWord, String userSex, String nickName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
        this.nickName = nickName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override public String toString() {
        return "UserEntity{" + "id=" + id + ", userName='" + userName + '\'' + ", passWord='"
            + passWord + '\'' + ", userSex='" + userSex + '\'' + ", nickName='" + nickName + '\''
            + '}';
    }

}
