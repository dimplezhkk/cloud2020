package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 郑豪
 * @Date 2020/4/30 12:37
 **/
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId")Long productId,@Param("count")Integer count);
}
