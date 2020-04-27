package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author 鄭豪
 * @Date 2020/4/20 22:42
 **/
public interface LoadBalancer {
    /**
     * 机器总数
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
