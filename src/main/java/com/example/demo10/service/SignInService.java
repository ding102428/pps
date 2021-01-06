package com.example.demo10.service;

import com.example.demo10.domin.User;

public interface SignInService {
   //判断邮箱是否存在,在然后注册
   boolean  signIn(User user,String uEmail);

}
