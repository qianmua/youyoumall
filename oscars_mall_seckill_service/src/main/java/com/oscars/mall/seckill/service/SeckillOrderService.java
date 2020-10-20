package com.oscars.mall.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oscars.common.utils.PageUtils;
import com.oscars.mall.seckill.entity.SeckillOrderEntity;

import java.util.Map;

/**
 * 
 *
 * @author qianmua
 * @email hjcwyhasgo@163.com
 * @date 2020-10-20 21:05:33
 */
public interface SeckillOrderService extends IService<SeckillOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

