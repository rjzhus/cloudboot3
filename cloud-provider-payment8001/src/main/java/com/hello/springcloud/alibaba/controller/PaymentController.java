package com.hello.springcloud.alibaba.controller;

import com.hello.springcloud.alibaba.entities.CommonResult;
import com.hello.springcloud.alibaba.entities.Payment;
import com.hello.springcloud.alibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private EurekaDiscoveryClient eurekaDiscoveryClient;

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

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = eurekaDiscoveryClient.getServices();
        for (String service : services) {
            log.info( "service:" + service );
        }
        List<ServiceInstance> instances = eurekaDiscoveryClient.getInstances( "CLOUD-PAYMENT-SERVICE" );
        for (ServiceInstance instance : instances) {
            log.info( "服务：" + instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri() );
        }
        return this.eurekaDiscoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try {
            TimeUnit.SECONDS.sleep( 3 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    /**
     * 测试zipkin
     *
     * @return
     */
    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to zipkin，O(∩_∩)O哈哈~";
    }
}
