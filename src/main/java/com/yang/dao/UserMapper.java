package com.yang.dao;

import com.yang.pojo.User;



public interface UserMapper {
    //得到登陆的用户
     User getLoginUser(String userName);
}
