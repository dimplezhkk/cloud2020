package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author 郑豪
 * @Date 2020/4/30 13:48
 **/
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money);
}
