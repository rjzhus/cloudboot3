package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 网关服务启动类
 *
 * @author zrj
 * @date 2021/2/2
 * @since V1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run( GatewayApplication9527.class, args );
    }
}
