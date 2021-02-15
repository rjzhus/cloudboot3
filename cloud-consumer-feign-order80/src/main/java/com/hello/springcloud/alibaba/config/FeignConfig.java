package com.hello.springcloud.alibaba.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign配置类
 *
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@Configuration
public class FeignConfig {

    /**
     * 配置Feign日志级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
