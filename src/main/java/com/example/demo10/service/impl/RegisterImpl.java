package com.example.demo10.service.impl;

import com.example.demo10.dao.UserDao;
import com.example.demo10.dao.impl.UserDaoImpl;
import com.example.demo10.domin.User;
import com.example.demo10.service.RegisterDao;

public class RegisterImpl implements RegisterDao {
    UserDao userDao=new UserDaoImpl();
    @Override
    public boolean register(User user) {
          if (userDao.addAll(user) == 1){
                      return true;
          }
          return false;
    }

}
