package com.oscars.mall.goods.controller;


import com.oscars.common.utils.R;
import com.oscars.mall.goods.service.GoodsRPCService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qianmuna
 * @since 2020-10-16
 */
@RestController
@RequestMapping("/goods/goods")
public class GoodsController {

    @Resource
    private GoodsRPCService goodsRPCService;

    @ApiOperation("查询所有接口")
    @GetMapping("/test/queryAll")
    public R queryAll(){
        return goodsRPCService.queryAllTest();
    }

}

