package com.hello.springcloud.alibaba.controller;

import com.hello.springcloud.alibaba.domain.CommonResult;
import com.hello.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease( userId, money );
        return new CommonResult( 200, "扣减账户余额成功！" );
    }
}
