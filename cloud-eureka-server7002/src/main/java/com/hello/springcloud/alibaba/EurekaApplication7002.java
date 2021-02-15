package com.hello.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer7002
 *
 * @author zrj
 * @date 2021/1/23
 * @since V1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run( EurekaApplication7002.class, args );
    }
}
