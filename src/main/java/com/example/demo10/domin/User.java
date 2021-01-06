package com.example.demo10.domin;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uEmail;
    private Date  uBirthday;
    private Sex uSex;
    private  Integer uClass;
    private String uStatement;
    private Timestamp uRegDate;
    private Integer uPoint;

    public User() {
    }

    public User(Integer uId, String uName, String uPassword, String uEmail, Date uBirthday, Sex uSex, Integer uClass, String uStatement, Timestamp uRegDate, Integer uPoint) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uEmail = uEmail;
        this.uBirthday = uBirthday;
        this.uSex = uSex;
        this.uClass = uClass;
        this.uStatement = uStatement;
        this.uRegDate = uRegDate;
        this.uPoint = uPoint;
    }

    public User(String uName, String uPassword, String uEmail, Date uBirthday, Sex uSex, Integer uClass, String uStatement, Timestamp uRegDate, Integer uPoint) {
        this.uName = uName;
        this.uPassword = uPassword;
        this.uEmail = uEmail;
        this.uBirthday = uBirthday;
        this.uSex = uSex;
        this.uClass = uClass;
        this.uStatement = uStatement;
        this.uRegDate = uRegDate;
        this.uPoint = uPoint;
    }

    public User(String uName, String uPassword, Date uBirthday, Sex uSex, Integer uClass, String uStatement, Timestamp uRegDate, Integer uPoint) {
        this.uName = uName;
        this.uPassword = uPassword;
        this.uBirthday = uBirthday;
        this.uSex = uSex;
        this.uClass = uClass;
        this.uStatement = uStatement;
        this.uRegDate = uRegDate;
        this.uPoint = uPoint;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public Sex getuSex() {
        return uSex;
    }

    public void setuSex(Sex uSex) {
        this.uSex = uSex;
    }

    public Integer getuClass() {
        return uClass;
    }

    public void setuClass(Integer uClass) {
        this.uClass = uClass;
    }

    public String getuStatement() {
        return uStatement;
    }

    public void setuStatement(String uStatement) {
        this.uStatement = uStatement;
    }

    public Timestamp getuRegDate() {
        return uRegDate;
    }

    public void setuRegDate(Timestamp uRegDate) {
        this.uRegDate = uRegDate;
    }

    public Integer getuPoint() {
        return uPoint;
    }

    public void setuPoint(Integer uPoint) {
        this.uPoint = uPoint;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uBirthday=" + uBirthday +
                ", uSex=" + uSex +
                ", uClass=" + uClass +
                ", uStatement='" + uStatement + '\'' +
                ", uRegDate=" + uRegDate +
                ", uPoint=" + uPoint +
                '}';
    }
}
