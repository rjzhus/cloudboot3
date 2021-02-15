package com.hello.springcloud.alibaba.controller;

import com.hello.springcloud.alibaba.entities.CommonResult;
import com.hello.springcloud.alibaba.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 订单控制层
 *
 * @author zrj
 * @date 2021/1/23
 * @since V1.0
 **/
@Slf4j
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        log.info( "订单消费者创建操作" );
        return restTemplate.postForObject( PAYMENT_URL + "/payment/create", payment, CommonResult.class );
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.info( "订单消费者查询操作" );
        return restTemplate.getForObject( PAYMENT_URL + "/payment/get/" + id, CommonResult.class );
    }

    /**
     * 测试zipkin
     *
     * @return
     */
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin() {
        String result = restTemplate.getForObject( PAYMENT_URL + "/payment/zipkin/", String.class );
        return result;
    }
}
