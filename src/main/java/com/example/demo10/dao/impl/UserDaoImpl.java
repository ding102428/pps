package com.example.demo10.dao.impl;

import com.example.demo10.dao.UserDao;
import com.example.demo10.domin.User;
import com.example.demo10.util.BaseDao;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int addAll(User user) {
        String sql="insert into  user (u_Name, u_Password, u_Email, u_Birthday, u_Sex, u_Class, u_statement, u_RegDate, u_Point) VALUES (?,?,?,?,?,?,?,?,?)";
        return executeUpdate(sql,
                user.getuName(),
                user.getuPassword(),
                user.getuEmail(),
                user.getuBirthday(),
                user.isuSex(),
                user.getuClass(),
                user.getUstatement(),
                user.getuRegDate(),
                user.getuPoint()
                );
    }

    @Override
    public List<User> findAll(User user) {
        return null;
    }
}
