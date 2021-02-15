package com.hello.springcloud.alibaba.service;

import com.hello.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 库存接口
 *
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
