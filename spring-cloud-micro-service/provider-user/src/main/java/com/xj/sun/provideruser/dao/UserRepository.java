package com.xj.sun.provideruser.dao;

import com.xj.sun.provideruser.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2017-2018, sunxiaojun
 * FileName: com.xj.sun.provideruser.dao
 * Author:   孙
 * Date:    2018/7/13 13:25
 * Description: 用户信息仓储
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
