package com.oscars.mall.seckill.service.impl;

import com.oscars.common.utils.PageUtils;
import com.oscars.common.utils.Query;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.oscars.mall.seckill.mapper.SeckillOrderDao;
import com.oscars.mall.seckill.entity.SeckillOrderEntity;
import com.oscars.mall.seckill.service.SeckillOrderService;


@Service("seckillOrderService")
@DubboService
public class SeckillOrderServiceImpl extends ServiceImpl<SeckillOrderDao, SeckillOrderEntity> implements SeckillOrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillOrderEntity> page = this.page(
                new Query<SeckillOrderEntity>().getPage(params),
                new QueryWrapper<SeckillOrderEntity>()
        );

        return new PageUtils(page);
    }

}