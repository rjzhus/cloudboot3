package com.hello.springcloud.alibaba.service;

import com.hello.springcloud.alibaba.domain.Order;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     */
    void create(Order order);
}
