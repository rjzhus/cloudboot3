package com.hello.springcloud.alibaba.service.impl;

import com.hello.springcloud.alibaba.dao.AccountDao;
import com.hello.springcloud.alibaba.service.AccountService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;


/**
 * @author zrj
 * @date 2021/2/14
 * @since V1.0
 **/
@Service
public class AccountServiceImpl implements AccountService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger( AccountServiceImpl.class );

    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info( "------->account-service中扣减账户余额开始" );
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep( 20 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease( userId, money );
        LOGGER.info( "------->account-service中扣减账户余额结束" );
    }
}
