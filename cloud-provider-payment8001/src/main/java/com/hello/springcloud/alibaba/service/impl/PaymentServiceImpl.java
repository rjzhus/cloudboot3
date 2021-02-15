package com.hello.springcloud.alibaba.service.impl;

import com.hello.springcloud.alibaba.dao.PaymentDao;
import com.hello.springcloud.alibaba.entities.Payment;
import com.hello.springcloud.alibaba.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zrj
 * @date 2021/1/20
 * @since V1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 创建
     *
     * @param payment
     * @return
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create( payment );
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById( id );
    }
}
