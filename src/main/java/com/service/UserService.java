package com.service;

import com.pojo.User;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/25 15:37
 */
public interface UserService {

    public User login(String username,String password);
}
