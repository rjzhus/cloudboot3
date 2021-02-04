package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zrj
 * @date 2021/2/4
 * @since V1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication3355 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigClientApplication3355.class, args );
    }
}
