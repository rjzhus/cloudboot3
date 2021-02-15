package com.hello.springcloud.alibaba.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zrj
 * @date 2021/2/11
 * @since V1.0
 **/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosApplication84 {
    public static void main(String[] args) {
        SpringApplication.run( OrderNacosApplication84.class, args );
    }
}
