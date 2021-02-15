package com.hello.springcloud.alibaba.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自定义负载均衡算法
 *
 * @author zrj
 * @date 2021/1/31
 * @since V1.0
 **/
public interface LoadBalancer {
    /**
     * 服务实例
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
