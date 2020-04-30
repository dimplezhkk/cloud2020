package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 郑豪
 * @Date 2020/4/30 12:47
 **/
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageService.class);

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("--------------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("----------->storage-service中扣减库存结束");

    }
}
