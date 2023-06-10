package com.flea.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 全局配置： @Configuration 用于所有服务提供方
 * 局部配置： 1.通过配置类，如果只想针对某一服务进行配置，不需要加@Configuration
 *           2.通过配置文件
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
