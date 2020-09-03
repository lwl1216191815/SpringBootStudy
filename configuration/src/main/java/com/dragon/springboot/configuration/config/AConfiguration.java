package com.dragon.springboot.configuration.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(BConfiguration.class)
public class AConfiguration {

    {
        System.out.println("AConfiguration");
    }
}
