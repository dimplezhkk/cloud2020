package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author 郑豪
 * @Date 2020/4/30 13:54
 **/
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账号余额
     * @param userId
     * @param money
     * @return
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账号余额成功！！！");
    }
}
