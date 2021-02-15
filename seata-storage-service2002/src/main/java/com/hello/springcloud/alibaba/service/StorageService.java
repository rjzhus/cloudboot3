package com.hello.springcloud.alibaba.service;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
