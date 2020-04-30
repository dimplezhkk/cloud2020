package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 郑豪
 * @Date 2020/4/30 11:33
 **/
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
