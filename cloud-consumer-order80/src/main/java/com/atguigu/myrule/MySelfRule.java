package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 郑豪
 * @Date 2020/4/20 22:16
 **/
@Configuration
public class MySelfRule {

    public IRule myRule(){

        return new RandomRule();//定义为“随机”的负债均衡策略
    }
}
