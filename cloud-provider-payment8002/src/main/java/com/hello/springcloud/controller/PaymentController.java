package com.hello.springcloud.controller;

import com.hello.springcloud.entities.CommonResult;
import com.hello.springcloud.entities.Payment;
import com.hello.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zrj
 * @date 2021/1/20
 * @since V1.0
 **/
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create( payment );
        log.info( "创建结果：" + result );
        return new CommonResult( 200, "创建成功,serverPort=" + serverPort, result );
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById( id );
        log.info( "查询结果：" + payment );
        return new CommonResult( 200, "查询创建,serverPort=" + serverPort, payment );
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
