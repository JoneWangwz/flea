package com.flea.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flea.entity.CommodityDetail;
import com.flea.mapper.CommodityDetailMapper;
import com.flea.service.CommodityService;
import com.flea.util.PageResult;
import com.flea.util.Params;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
public class CommodityServiceImpl extends ServiceImpl<CommodityDetailMapper, CommodityDetail> implements CommodityService {

    @Autowired
    CommodityDetailMapper commodityDetailMapper;

    public PageResult find(Params params) {
        Page<CommodityDetail> commodityDetailPage = commodityDetailMapper.find(params);
        //return new PageResult(commodityDetailPage.getSize(), commodityDetailPage.getRecords());
        return null;
    }

    public String test() {
        return "测试通过！";
    }
}
