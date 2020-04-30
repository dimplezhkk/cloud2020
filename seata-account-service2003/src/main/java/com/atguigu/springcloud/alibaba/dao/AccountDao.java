package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author 鄭豪
 * @Date 2020/4/30 13:41
 **/
public interface AccountDao {

    /**
     * 扣减账户金额
     */
    void decrease(@Param("userId")Long userId, @Param("money")BigDecimal money);
}
