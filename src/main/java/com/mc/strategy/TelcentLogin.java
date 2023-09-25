package com.mc.strategy;

import com.mc.common.LoginResp;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @className TelcentLogin
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
@Component
public class TelcentLogin implements UserLogin{
    @Override
    public LoginResp login(String type) {
        System.out.println("qq登录");
        return null;
    }
}
