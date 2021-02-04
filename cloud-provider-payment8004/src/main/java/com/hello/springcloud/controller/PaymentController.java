package com.hello.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zrj
 * @date 2021/1/24
 * @since V1.0
 **/
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentzk() {
        log.info( "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString() );
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }


}
