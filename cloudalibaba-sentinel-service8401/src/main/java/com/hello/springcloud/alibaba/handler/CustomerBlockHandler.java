package com.hello.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hello.springcloud.alibaba.entities.CommonResult;

/**
 * @author zrj
 * @date 2021/2/12
 * @since V1.0
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult( 4444, "按客戶自定义,global handlerException----1" );
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult( 4444, "按客戶自定义,global handlerException----2" );
    }
}
