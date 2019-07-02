package com.example.mycatdemo.service;

import com.example.mycatdemo.domain.User;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:44
 * @description
 */
public interface UserService {
    List<User> listUser();

    void addUser(final User user);

}
