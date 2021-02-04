package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zrj
 * @date 2021/2/4
 * @since V1.0
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterApplication3344 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigCenterApplication3344.class, args );
    }

}
