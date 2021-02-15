package com.hello.springcloud.alibaba.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * 服务熔断限流降级接口
 *
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@Service
public class PaymentService {

    /**
     * 服务正常
     */
    public String paymentInto_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_OK, id: " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * 服务超时
     */
    @HystrixCommand(fallbackMethod = "paymnetInfo_TimeOutHandler",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    public String paymentInfo_TimeOut(Integer id) {
        //int age = 10/0;
        try {
            TimeUnit.MILLISECONDS.sleep( 3000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "【服务超时】线程池:  " + Thread.currentThread().getName() + " id:  " + id + "\t" + "O(∩_∩)O哈哈~" + "  耗时(秒): ";
    }

    /**
     * 服务降级
     */
    public String paymnetInfo_TimeOutHandler(Integer id) {
        return "【服务降级】线程池:  " + Thread.currentThread().getName() + "  8001系统繁忙或者运行报错，请稍后再试,id:  " + id + "\t" + "o(╥﹏╥)o";
    }

    /**
     * 服务熔断
     * 10s时间内，调用10次，失败率达到60%，就会熔断
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException( "******id 不能负数" );
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t" + "调用成功，流水号: " + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id) {
        return "【服务降级】id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " + id;
    }

}
