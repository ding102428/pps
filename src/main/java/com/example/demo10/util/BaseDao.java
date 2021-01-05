package com.example.demo10.util;

import java.sql.*;

public class BaseDao {
    private Connection connection;
    private PreparedStatement preparedStatement;

    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/forums", "ding", "@dK102428");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public Connection getConnection(){
        if (connection==null){
            try {
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/forums", "ding", "@dK102428");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return connection;
    }
    public ResultSet executeQuery(String sql,Object... params){
        connection=getConnection();
        try {
            preparedStatement=connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++)
                preparedStatement.setObject(i+1,params[i]);
                return preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public int executeUpdate(String sql, Object... params){
        connection=getConnection();
        try {
            preparedStatement=connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++)
                preparedStatement.setObject(i+1,params[i]);
                return preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
}
