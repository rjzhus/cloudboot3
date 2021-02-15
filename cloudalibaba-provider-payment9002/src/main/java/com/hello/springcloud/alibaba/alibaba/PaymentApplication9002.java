package com.hello.springcloud.alibaba.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zrj
 * @date 2021/2/11
 * @since V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run( PaymentApplication9002.class, args );
    }
}
