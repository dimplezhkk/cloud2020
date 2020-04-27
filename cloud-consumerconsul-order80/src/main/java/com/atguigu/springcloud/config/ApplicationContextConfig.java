package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 郑豪
 * @Date 2020/4/20 21:28
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //负债均衡
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
}
