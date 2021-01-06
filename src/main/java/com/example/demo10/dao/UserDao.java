package com.example.demo10.dao;


import com.example.demo10.domin.User;

import java.util.List;

public interface UserDao {
    //用户创建
    int addAll (User user);
    //查询全部
    List<User> findAll(User user);
    //查询邮箱
    String userAllEmail(String email);
}
