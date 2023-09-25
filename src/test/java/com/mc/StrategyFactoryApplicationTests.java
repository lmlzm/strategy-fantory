package com.mc;

import com.mc.util.UserLoginConfigUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class StrategyFactoryApplicationTests {

    @Resource
    UserLoginConfigUtil userLoginConfigUtil;

    @Test
    void contextLoads() {

        System.out.println(userLoginConfigUtil.getLoginMethod());
    }

}
