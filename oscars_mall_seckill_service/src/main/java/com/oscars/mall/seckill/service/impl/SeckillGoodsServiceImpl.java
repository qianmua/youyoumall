package com.oscars.mall.seckill.service.impl;

import com.oscars.common.utils.PageUtils;
import com.oscars.common.utils.Query;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oscars.mall.seckill.mapper.SeckillGoodsDao;
import com.oscars.mall.seckill.entity.SeckillGoodsEntity;
import com.oscars.mall.seckill.service.SeckillGoodsService;


@Service("seckillGoodsService")
@DubboService
public class SeckillGoodsServiceImpl extends ServiceImpl<SeckillGoodsDao, SeckillGoodsEntity> implements SeckillGoodsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillGoodsEntity> page = this.page(
                new Query<SeckillGoodsEntity>().getPage(params),
                new QueryWrapper<SeckillGoodsEntity>()
        );

        return new PageUtils(page);
    }

}