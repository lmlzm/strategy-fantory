package com.mc.strategy;

import com.mc.common.LoginResp;
import org.springframework.stereotype.Component;

/**
 * @className AccountLogin
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
@Component
public class AccountLogin implements UserLogin{
    @Override
    public LoginResp login(String type) {
        System.out.println("用户名和密码登录");
        return null;
    }
}
