package com.flea.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flea.entity.CommodityDetail;
import com.flea.util.Params;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommodityDetailMapper extends BaseMapper<CommodityDetail> {

    Page<CommodityDetail> find(Params params);
}
