package com.hello.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
