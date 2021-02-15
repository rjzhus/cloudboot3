package com.hello.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付主启动类
 *
 * @author zrj
 * @date 2021/01/23
 * @since v1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run( PaymentApplication8002.class, args );
    }

}
