package com.hello.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zrj
 * @date 2021/1/23
 * @since V1.0
 **/
@Configuration
public class ApplicationContextConfig {

    /**
     * 注入RestTemplate
     * 开启RestTemplate负载均衡
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
