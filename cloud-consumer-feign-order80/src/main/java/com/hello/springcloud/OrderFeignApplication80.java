package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 *
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@EnableFeignClients
@SpringBootApplication
public class OrderFeignApplication80 {
    public static void main(String[] args) {
        SpringApplication.run( OrderFeignApplication80.class, args );
    }
}
