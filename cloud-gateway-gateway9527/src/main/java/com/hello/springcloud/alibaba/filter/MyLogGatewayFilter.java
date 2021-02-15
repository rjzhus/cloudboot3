package com.hello.springcloud.alibaba.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * 自定义过滤器
 *
 * @author zrj
 * @date 2021/2/2
 * @since V1.0
 **/
@Slf4j
@Component
public class MyLogGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info( "***********come in MyLogGateWayFilter:  " + new Date() );

        String uname = exchange.getRequest().getQueryParams().getFirst( "uname" );

        if (uname == null) {
            log.info( "*******用户名为null，非法用户，o(╥﹏╥)o" );
            exchange.getResponse().setStatusCode( HttpStatus.NOT_ACCEPTABLE );
            return exchange.getResponse().setComplete();
        }

        return chain.filter( exchange );
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
