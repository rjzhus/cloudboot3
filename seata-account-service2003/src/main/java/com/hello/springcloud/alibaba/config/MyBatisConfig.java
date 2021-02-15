package com.hello.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@Configuration
@MapperScan({"com.hello.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
