package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class OrderHystrixApplication80 {
    public static void main(String[] args) {
        SpringApplication.run( OrderHystrixApplication80.class, args );
    }
}
