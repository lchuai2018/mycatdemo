package com.example.mycatdemo.mapper;

import com.example.mycatdemo.domain.User;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:42
 * @description
 */
public interface UserMapper {

    List<User> selectUserList();

    void addUser(final User user);
}
