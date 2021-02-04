package com.hello.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * service降级处理类
 *
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    /**
     * 服务正常
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "【服务降级】-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    /**
     * 服务降级
     */
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "【服务降级】-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
