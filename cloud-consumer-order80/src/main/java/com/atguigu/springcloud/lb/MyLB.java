package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author 郑豪
 * Ribbon 手写轮询算法
 * @Date 2020/4/20 22:45
 **/
@Component
public class MyLB implements LoadBalancer {

    //原子类
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    //得到并且增加
    public final int getAndIncrement(){
        int current;
        //超过最大值，为0，重新计数 2147483647 Integer.MAX_VALUE，不直接写方法是因为方法运行时每次都会创建一个栈区，而写死就不会，涉及Jvm调优
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问，次数next:"+next);
        return next;
    }

    /**
     * 负债均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标，每次服务器重新启动rest接口计数从1开始
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
