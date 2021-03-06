package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 郑豪
 * @Date 2020/4/30 10:38
 **/
@Mapper
public interface OrderDao {
    /**
     * 1.新建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态 从0改为1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
