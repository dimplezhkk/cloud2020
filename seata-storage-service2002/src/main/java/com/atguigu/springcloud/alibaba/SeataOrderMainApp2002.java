package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 郑豪
 * @Date 2020/4/30 13:32
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源的自动创建
@EnableDiscoveryClient
@EnableFeignClients
public class SeataOrderMainApp2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderMainApp2002.class,args);
    }
}
