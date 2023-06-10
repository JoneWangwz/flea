package com.flea.feign.service.commodity.fallback;

import com.flea.feign.service.commodity.CommodityFeignService;
import com.flea.util.PageResult;
import org.springframework.stereotype.Component;

@Component
public class CommodityFeignServiceFallBack implements CommodityFeignService {
    @Override
    public PageResult findResult() {
        return null;
    }

    @Override
    public String test() {
        return "测试失败";
    }
}
