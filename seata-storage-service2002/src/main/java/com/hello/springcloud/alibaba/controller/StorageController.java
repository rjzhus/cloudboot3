package com.hello.springcloud.alibaba.controller;

import com.hello.springcloud.alibaba.domain.CommonResult;
import com.hello.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease( productId, count );
        return new CommonResult( 200, "扣减库存成功！" );
    }
}
