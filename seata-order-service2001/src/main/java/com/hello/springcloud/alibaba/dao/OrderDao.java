package com.hello.springcloud.alibaba.dao;

import com.hello.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@Mapper
public interface OrderDao {
    /**
     * 创建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 更新订单
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
