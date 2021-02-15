package com.hello.springcloud.alibaba.service;

import com.hello.springcloud.alibaba.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zrj
 * @date 2021/1/20
 * @since V1.0
 **/
public interface PaymentService {
    /**
     * 创建
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
