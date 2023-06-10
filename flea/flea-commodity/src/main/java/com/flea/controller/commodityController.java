package com.flea.controller;

import com.flea.service.CommodityService;
import com.flea.util.PageResult;
import com.flea.util.Params;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
public class commodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping("/find")
    public PageResult findResult() {
        try {
            Params params = new Params();
            PageResult pageResult = commodityService.find(params);
            return pageResult;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping("/test")
    public String test() {
        try {

            String test = commodityService.test();
            return "成功！";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
