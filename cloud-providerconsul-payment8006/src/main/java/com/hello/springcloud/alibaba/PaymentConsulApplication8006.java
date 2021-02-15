package com.hello.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zrj
 * @date 2021/1/24
 * @since V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentConsulApplication8006 {
    public static void main(String[] args) {
        SpringApplication.run( PaymentConsulApplication8006.class, args );
    }
}
