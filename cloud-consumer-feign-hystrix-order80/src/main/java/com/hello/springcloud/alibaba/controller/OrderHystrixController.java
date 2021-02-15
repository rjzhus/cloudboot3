package com.hello.springcloud.alibaba.controller;

import com.hello.springcloud.alibaba.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * controller降级处理
 *
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@Slf4j
@RestController
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK( id );
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod"
            , commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")})
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        String result = paymentHystrixService.paymentInfo_TimeOut( id );
        return result;
    }

    /**
     * 只要上述服务不可用，无论是异常或者超时都会走设置的fallbackMethod
     */
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "【服务降级】我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }

    /**
     * 全局服务降级
     */
    @GetMapping("/consumer/payment/hystrix/timeoutglobal/{id}")
    @HystrixCommand
    public String paymentInfo_TimeOutGlobal(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        String result = paymentHystrixService.paymentInfo_TimeOut( id );
        return result;
    }

    /**
     * 下面是全局fallback方法
     */
    public String payment_Global_FallbackMethod() {
        return "【全局fallback】Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~";
    }
}
