package com.xj.sun.provideruser.controller;

import com.xj.sun.provideruser.dao.UserRepository;
import com.xj.sun.provideruser.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Copyright (C), 2017-2018, sunxiaojun
 * FileName: com.xj.sun.provideruser.controller
 * Author:   孙
 * Date:    2018/7/13 13:26
 * Description: 用户控住类
 **/

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        Optional<User> op = userRepository.findById(id);
        return op.get();
    }
}
