package com.mc.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @className UserLoginConfigUtil
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/25
 * @version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "user")
public class UserLoginConfigUtil {

    private Map<String, String> loginMethod;


}
