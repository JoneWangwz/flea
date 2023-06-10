package com.flea.feign.service.commodity;

import com.flea.feign.service.commodity.fallback.CommodityFeignServiceFallBack;
import com.flea.util.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "commodity-service", path = "/order", fallback = CommodityFeignServiceFallBack.class)
public interface CommodityFeignService {

    @RequestMapping("/find")
    PageResult findResult();

    @RequestMapping("/test")
    String test();
}
