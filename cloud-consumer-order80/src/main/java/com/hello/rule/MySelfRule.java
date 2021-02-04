package com.hello.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置ribbon策略
 * 注意：不要放在主程序所在宝及其子包等能被ComponentScan扫描到的包下面
 *
 * @author zrj
 * @date 2021/1/23
 * @since V1.0
 **/
@Configuration
public class MySelfRule {
    /**
     * 定义为随机
     */
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
