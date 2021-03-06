package com.xj.sun.consumermoviefeginclient.pojo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * Copyright (C), 2017-2018, sunxiaojun
 * FileName: com.xj.sun.provideruser.pojo
 * Author:   孙
 * Date:    2018/7/13 13:06
 * Description: 用户实体类
 **/

public class User {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                ToStringStyle.DEFAULT_STYLE);
    }
}
