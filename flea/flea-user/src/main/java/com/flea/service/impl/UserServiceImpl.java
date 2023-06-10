package com.flea.service.impl;

import com.flea.feign.service.commodity.CommodityFeignService;
import com.flea.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    CommodityFeignService commodityFeignService;

    @Override
    public String test() {
        String test = commodityFeignService.test();
        return test;
    }
}
