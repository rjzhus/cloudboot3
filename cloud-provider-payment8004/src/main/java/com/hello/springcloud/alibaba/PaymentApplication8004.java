package com.hello.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * zk主启动类
 * EnableDiscoveryClient
 * 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 *
 * @author zrj
 * @date 2021/1/24
 * @since V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication8004 {
    public static void main(String[] args) {
        SpringApplication.run( PaymentApplication8004.class, args );
    }
}
