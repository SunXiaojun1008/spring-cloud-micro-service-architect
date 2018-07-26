package com.xj.sun.provideruser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2017-2018, sunxiaojun
 * FileName: com.xj.sun.provideruser.controller
 * Author:   孙
 * Date:    2018/7/26 15:08
 * Description: //模块目的、功能描述
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${info.app.java.source}")
    private String ipAddress;

    @GetMapping("/profile")
    public String hello(){
        return this.ipAddress;
    }
}
