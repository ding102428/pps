<%--
  Created by IntelliJ IDEA.
  User: dk
  Date: 1/7/21
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
 <h3>注册</h3>
<form action="signIn" method="post">
    <b>姓名:</b><input name="name"> <br>
    <b>邮箱:</b><input name="email"> <br>
    <b>密码:</b><input name="password" type="password"> <br>
    <b>出生日期:</b><input name="birthday" type="date"><br>
    <b>性别:</b>
    男<input type="radio" name="Sex" value="F" onclick="show();">　　
    女<input type="radio" name="Sex" value="M" checked onclick="hidd();"><br>
    <input type="submit" value="注册"> <br>
</form>
</body>
</html>
