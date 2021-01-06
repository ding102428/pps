package com.example.demo10.service.impl;

import com.example.demo10.dao.UserDao;
import com.example.demo10.dao.impl.UserDaoImpl;
import com.example.demo10.domin.User;
import com.example.demo10.service.SignInService;

public class SignInServiceImpl implements SignInService {
    private final UserDao userDao=new UserDaoImpl();
    @Override
    public boolean signIn(User user,String userEmail) {
        if (userDao.userAllEmail(userEmail)!=null){
            return false;
        } else {
           userDao.addAll(user);
            return true;
        }

    }
}
