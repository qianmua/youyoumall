package com.oscars.mall.seckill.controller;

import java.util.Arrays;
import java.util.Map;

import com.oscars.common.utils.PageUtils;
import com.oscars.common.utils.R;
import com.oscars.mall.seckill.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oscars.mall.seckill.entity.SeckillGoodsEntity;



/**
 * 
 *
 * @author qianmua
 * @email hjcwyhasgo@163.com
 * @date 2020-10-20 21:05:33
 */
@RestController
@RequestMapping("generator/seckillgoods")
public class SeckillGoodsController {
    @Autowired
    private SeckillGoodsService seckillGoodsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillGoodsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SeckillGoodsEntity seckillGoods = seckillGoodsService.getById(id);

        return R.ok().put("seckillGoods", seckillGoods);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SeckillGoodsEntity seckillGoods){
		seckillGoodsService.save(seckillGoods);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SeckillGoodsEntity seckillGoods){
		seckillGoodsService.updateById(seckillGoods);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		seckillGoodsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
