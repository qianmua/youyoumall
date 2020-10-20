package com.oscars.mall.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oscars.common.utils.PageUtils;
import com.oscars.mall.seckill.entity.SeckillGoodsEntity;

import java.util.Map;

/**
 * 
 *
 * @author qianmua
 * @email hjcwyhasgo@163.com
 * @date 2020-10-20 21:05:33
 */
public interface SeckillGoodsService extends IService<SeckillGoodsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

