package com.example.mycatdemo.service.impl;

import com.example.mycatdemo.domain.User;
import com.example.mycatdemo.mapper.UserMapper;
import com.example.mycatdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:46
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.selectUserList();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
