package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.SnowFlakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 郑豪
 * 测试雪花算法
 * @Date 2020/4/30 15:22
 **/
@RestController
public class SnowFlakeController {

    @Autowired
    private SnowFlakeService snowFlakeService;

    @RequestMapping("/snowflake")
    public String index(){

        return snowFlakeService.getIDBySnowFlake();
    }
}
