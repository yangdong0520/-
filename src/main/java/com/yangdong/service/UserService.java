package com.yangdong.service;

import com.yangdong.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
