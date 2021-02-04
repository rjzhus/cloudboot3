package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer7001
 *
 * @author zrj
 * @date 2021/1/23
 * @since V1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run( EurekaApplication7001.class, args );
    }
}
