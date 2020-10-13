package com.yang.service;

import com.yang.dao.BookMapper;
import com.yang.dao.UserMapper;
import com.yang.pojo.User;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    @Override
    public User getLoginUser(String userName) {
        return userMapper.getLoginUser(userName);
    }
}
