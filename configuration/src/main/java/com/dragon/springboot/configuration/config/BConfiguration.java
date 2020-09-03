package com.dragon.springboot.configuration.config;

import org.springframework.context.annotation.Configuration;

/**
 * 测试configuration注解和@bean注解搭配使用的效果
 */
@Configuration
public class BConfiguration {

    {
        System.out.println("BeanConfiguration");
    }
}
