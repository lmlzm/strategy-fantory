package com.mc.controller;

import com.mc.common.LoginResp;
import com.mc.strategy.UserLogin;
import com.mc.strategy.UserLoginFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className LoginController
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Resource
    private UserLoginFactory userLoginFactory;

    @PostMapping()
    public LoginResp login(String type){
        UserLogin userLogin = userLoginFactory.getUserLogin(type);
        LoginResp login = userLogin.login(type);
        return login;
    }

}
