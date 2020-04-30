package com.atguigu.springcloud.alibaba.service;

/**
 * @Author 鄭豪
 * @Date 2020/4/30 12:46
 **/
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
