package com.hello.springcloud.alibaba.alibaba.service;

import com.hello.springcloud.alibaba.entities.CommonResult;
import com.hello.springcloud.alibaba.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zrj
 * @date 2021/2/11
 * @since V1.0
 **/
@Component
public class PaymentFallbackService implements PaymentService {
    /**
     * 服务降级返回
     *
     * @param id
     * @return
     */
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>( 200, "服务降级返回,---PaymentFallbackService", new Payment( id, "errorSerial" ) );
    }
}
