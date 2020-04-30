package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.service.SnowFlakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author 郑豪
 * @Date 2020/4/30 15:25
 **/
@Service
public class SnowFlakeServiceImpl implements SnowFlakeService {

    @Autowired
    private IdGeneratorSnowFlake idGeneratorSnowFlake;

    @Override
    public String getIDBySnowFlake(){

        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i=1;i<=20;i++){
          threadPool.submit(() -> {
              System.out.println(idGeneratorSnowFlake.snowflakeId());
            });
        }
        threadPool.shutdown();

        return "hello snowflake";
    }
}
