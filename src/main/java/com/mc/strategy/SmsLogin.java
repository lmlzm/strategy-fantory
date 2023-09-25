package com.mc.strategy;

import com.mc.common.LoginResp;
import org.springframework.stereotype.Component;

/**
 * @className SmsLogin
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
@Component
public class SmsLogin implements UserLogin {
    @Override
    public LoginResp login(String type) {

        System.out.println("邮箱登录");
        return null;
    }
}
