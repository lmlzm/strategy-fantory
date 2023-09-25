package com.mc.strategy;

import com.mc.common.LoginResp;

/**
 * @interfaceName UserLogin
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
public interface UserLogin {

    /**
     * 根据不同类型登录系统
     * @param type
     * @return
     */
    LoginResp login(String type);
}
