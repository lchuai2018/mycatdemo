package com.example.mycatdemo.controller;

import com.example.mycatdemo.domain.User;
import com.example.mycatdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/28 18:40
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "listUser")
    public List<User> listUser() {
        return userService.listUser();
    }

    @GetMapping(value = "addUser")
    public String addUser(User user) {

        for(int i=0;i<11100;i++) {
            User user1=new User();
            user1.setCompanyId(i);
            user1.setUserId(i);
            user1.setUserName("张三"+i);
            userService.addUser(user1);
        }
        return "ok";
    }
}