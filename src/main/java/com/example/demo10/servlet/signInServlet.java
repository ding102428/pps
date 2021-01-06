package com.example.demo10.servlet;

import com.example.demo10.domin.Sex;
import com.example.demo10.domin.User;
import com.example.demo10.service.SignInService;
import com.example.demo10.service.impl.SignInServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

@WebServlet("/signIn")
public class signInServlet extends HttpServlet {
    SignInService signInService = new SignInServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uName = req.getParameter("name");
        String uEmail = req.getParameter("email");
        String uPassword = req.getParameter("password");
        Date uBirthday = Date.valueOf(req.getParameter("birthday"));
        Sex uSex = Sex.valueOf(req.getParameter("Sex"));
        int uClass = Integer.parseInt(req.getParameter("Class"));
        String uStatement = req.getParameter("statement");
        Timestamp uRegDate = Timestamp.valueOf("regDate");
        int uPoint=Integer.parseInt(req.getParameter("point"));
        User user=new User(uName,uPassword,uBirthday,uSex,uClass,uStatement,uRegDate,uPoint);

        if (signInService.signIn(user,uEmail)==true){
            //跳转index页面,注册
            resp.sendRedirect("index.html");
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }
}
