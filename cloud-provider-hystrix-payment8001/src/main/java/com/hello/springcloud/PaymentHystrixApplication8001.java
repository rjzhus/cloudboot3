package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run( PaymentHystrixApplication8001.class, args );
    }
}
