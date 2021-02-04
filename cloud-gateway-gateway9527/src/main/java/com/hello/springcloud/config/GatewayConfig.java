package com.hello.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * springcloud gateway配置类
 *
 * @author zrj
 * @date 2021/2/2
 * @since V1.0
 **/
@Configuration
public class GatewayConfig {

    /**
     * 配置相当于在yml中配置了一个id为path_route_hello的路由规则
     * 当访问地址http://localhost:9527/guonei的时候，gateway会通过断言是否为true
     * 匹配到对应的URI地址：http://news.baidu.com/guonei
     *
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route( "path_route_hello",
                r -> r.path( "/guonei" )
                        .uri( "http://news.baidu.com/guonei" ) ).build();

        return routes.build();
    }
}
