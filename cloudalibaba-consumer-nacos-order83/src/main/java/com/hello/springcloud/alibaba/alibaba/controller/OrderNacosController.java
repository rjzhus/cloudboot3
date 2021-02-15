package com.hello.springcloud.alibaba.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zrj
 * @date 2021/2/11
 * @since V1.0
 **/
@Slf4j
@RestController
public class OrderNacosController {
    @Resource
    private RestTemplate restTemplate;

    /**
     * 配置文件中获取nacos服务地址
     */
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject( serverURL + "/payment/nacos/" + id, String.class );
    }
}
