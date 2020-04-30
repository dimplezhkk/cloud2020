package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.AccountDao;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author 郑豪
 * @Date 2020/4/30 13:50
 **/
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
     AccountDao accountDao;

    /**
     * 扣减账户金额
     * @param userId
     * @param money
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("---------------->account-service中扣减账号余额开始");
        accountDao.decrease(userId,money);
        LOGGER.info("---------------->account-service中扣减账号余额结束");
    }
}
