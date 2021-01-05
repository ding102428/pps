package com.example.demo10.dao;


import com.example.demo10.doim.User;

import java.util.List;

public interface UserDao {
    int addAll (User user);
    List<User> findAll(User user);
}
