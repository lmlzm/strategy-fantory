package com.mc.strategy;

import com.mc.util.UserLoginConfigUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @className UserLoginFactory
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
@Component
public class UserLoginFactory implements ApplicationContextAware {

    @Resource
    private UserLoginConfigUtil userLoginConfigUtil;

    private static ConcurrentHashMap<String,UserLogin> userLoginMap = new ConcurrentHashMap<String,UserLogin>();


    /**
     * 把配置文件中的信息存储到map中
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        userLoginConfigUtil.getLoginMethod().forEach((k,v)->{
            userLoginMap.put(k, (UserLogin) applicationContext.getBean(v));
        });
    }


    public UserLogin getUserLogin(String type){
        return userLoginMap.get(type);
    }
}
