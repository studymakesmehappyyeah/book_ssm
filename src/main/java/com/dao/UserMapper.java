package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/25 15:38
 */
public interface UserMapper {
    public User login(@Param("username")String username, @Param("password")String password);
}
