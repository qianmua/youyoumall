package com.oscars.mall.web.controller;

import com.oscars.common.utils.R;
import com.oscars.mall.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/10/16  16:55
 * @description :
 */
@RestController
@RequestMapping("/test")
public class GoodsTestController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/all")
    public R queryAll(){
        return goodsService.queryAllTest();
    }
}
