package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 *
 * @author zrj
 * @date 2021/01/23
 * @since v1.0
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run( PaymentApplication8001.class, args );
    }

}
