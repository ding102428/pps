package com.example.demo10.domin;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
    private int uId;
    private String uName;
    private String uPassword;
    private String uEmail;
    private Date  uBirthday;
    private boolean uSex;
    private  int uClass;
    private String ustatement;
    private Timestamp uRegDate;
    private int uPoint;

    public User() {
    }

    public User(int uId, String uName, String uPassword, String uEmail, Date uBirthday, boolean uSex, int uClass, String ustatement, Timestamp uRegDate, int uPoint) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uEmail = uEmail;
        this.uBirthday = uBirthday;
        this.uSex = uSex;
        this.uClass = uClass;
        this.ustatement = ustatement;
        this.uRegDate = uRegDate;
        this.uPoint = uPoint;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
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

    public boolean isuSex() {
        return uSex;
    }

    public void setuSex(boolean uSex) {
        this.uSex = uSex;
    }

    public int getuClass() {
        return uClass;
    }

    public void setuClass(int uClass) {
        this.uClass = uClass;
    }

    public String getUstatement() {
        return ustatement;
    }

    public void setUstatement(String ustatement) {
        this.ustatement = ustatement;
    }

    public Timestamp getuRegDate() {
        return uRegDate;
    }

    public void setuRegDate(Timestamp uRegDate) {
        this.uRegDate = uRegDate;
    }

    public int getuPoint() {
        return uPoint;
    }

    public void setuPoint(int uPoint) {
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
                ", ustatement='" + ustatement + '\'' +
                ", uRegDate=" + uRegDate +
                ", uPoint=" + uPoint +
                '}';
    }
}
