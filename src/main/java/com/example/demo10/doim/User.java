package com.example.demo10.doim;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
    private int u_Id;
    private String u_Name;
    private String u_Password;
    private String u_Email;
    private Date  u_Birthday;
    private boolean u_Sex;
    private  int u_Class;
    private String u_statement;
    private Timestamp u_RegDate;
    private int u_Point;

    public User() {
    }

    public User(int u_Id, String u_Name, String u_Password, String u_Email, Date u_Birthday, boolean u_Sex, int u_Class, String u_statement, Timestamp u_RegDate, int u_Point) {
        this.u_Id = u_Id;
        this.u_Name = u_Name;
        this.u_Password = u_Password;
        this.u_Email = u_Email;
        this.u_Birthday = u_Birthday;
        this.u_Sex = u_Sex;
        this.u_Class = u_Class;
        this.u_statement = u_statement;
        this.u_RegDate = u_RegDate;
        this.u_Point = u_Point;
    }

    public int getU_Id() {
        return u_Id;
    }

    public void setU_Id(int u_Id) {
        this.u_Id = u_Id;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name;
    }

    public String getU_Password() {
        return u_Password;
    }

    public void setU_Password(String u_Password) {
        this.u_Password = u_Password;
    }

    public String getU_Email() {
        return u_Email;
    }

    public void setU_Email(String u_Email) {
        this.u_Email = u_Email;
    }

    public Date getU_Birthday() {
        return u_Birthday;
    }

    public void setU_Birthday(Date u_Birthday) {
        this.u_Birthday = u_Birthday;
    }

    public boolean isU_Sex() {
        return u_Sex;
    }

    public void setU_Sex(boolean u_Sex) {
        this.u_Sex = u_Sex;
    }

    public int getU_Class() {
        return u_Class;
    }

    public void setU_Class(int u_Class) {
        this.u_Class = u_Class;
    }

    public String getU_statement() {
        return u_statement;
    }

    public void setU_statement(String u_statement) {
        this.u_statement = u_statement;
    }

    public Timestamp getU_RegDate() {
        return u_RegDate;
    }

    public void setU_RegDate(Timestamp u_RegDate) {
        this.u_RegDate = u_RegDate;
    }

    public int getU_Point() {
        return u_Point;
    }

    public void setU_Point(int u_Point) {
        this.u_Point = u_Point;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_Id=" + u_Id +
                ", u_Name='" + u_Name + '\'' +
                ", u_Password='" + u_Password + '\'' +
                ", u_Email='" + u_Email + '\'' +
                ", u_Birthday=" + u_Birthday +
                ", u_Sex=" + u_Sex +
                ", u_Class=" + u_Class +
                ", u_statement='" + u_statement + '\'' +
                ", u_RegDate=" + u_RegDate +
                ", u_Point=" + u_Point +
                '}';
    }
}
