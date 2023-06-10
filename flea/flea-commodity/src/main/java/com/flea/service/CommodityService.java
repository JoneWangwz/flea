package com.flea.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flea.entity.CommodityDetail;
import com.flea.util.PageResult;
import com.flea.util.Params;
import com.flea.util.Result;

import java.util.List;

public interface CommodityService extends IService<CommodityDetail> {

    PageResult find(Params params);

    String test();
}
