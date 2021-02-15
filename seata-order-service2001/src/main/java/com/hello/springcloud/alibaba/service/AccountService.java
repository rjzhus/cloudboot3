package com.hello.springcloud.alibaba.service;

import com.hello.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@FeignClient(value = "seata-account-service")
public interface AccountService {

    /**
     * 扣减账户金额
     *
     * @param userId
     * @param money
     * @return
     */
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
