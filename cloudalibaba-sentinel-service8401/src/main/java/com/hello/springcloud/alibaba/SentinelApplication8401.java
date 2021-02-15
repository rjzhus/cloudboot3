package com.hello.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zrj
 * @date 2021/2/12
 * @since V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run( SentinelApplication8401.class, args );
    }
}
