package com.service;

import com.dao.UserMapper;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/25 15:38
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        return this.userMapper.login(username,password);
    }
}
