package com.example.demo10.dao.impl;

import com.example.demo10.dao.UserDao;
import com.example.demo10.domin.Sex;
import com.example.demo10.domin.User;
import com.example.demo10.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
                user.getuSex(),
                user.getuClass(),
                user.getuStatement(),
                user.getuRegDate(),
                user.getuPoint()
                );
    }

    @Override
    public List<User> findAll(User user) {
        List<User> users=new ArrayList<>();
        String sql="select*from user";
        ResultSet resultSet=executeQuery(sql);
        try {
            while (resultSet.next()){
                users.add(new User(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4),
                        Sex.valueOf(resultSet.getString(5)),
                        resultSet.getInt(6),
                        resultSet.getString(7),
                        resultSet.getTimestamp(8),
                        resultSet.getInt(9)
                ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    @Override
    public String  userAllEmail(String email) {
        String sql="select u_Email from user where u_Email=?";
       ResultSet resultSet=executeQuery(sql);
        try {
            if (resultSet!=null)
            if (resultSet.next()){
                return resultSet.getString(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
