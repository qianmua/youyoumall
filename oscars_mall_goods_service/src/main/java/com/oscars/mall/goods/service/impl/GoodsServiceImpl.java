package com.oscars.mall.goods.service.impl;

import com.oscars.common.utils.R;
import com.oscars.mall.goods.entity.Goods;
import com.oscars.mall.goods.mapper.GoodsMapper;
import com.oscars.mall.goods.service.GoodsRPCService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qianmuna
 * @since 2020-10-16
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsRPCService {

    @Override
    public R queryAllTest() {
        return R.ok().put("rows" , this.list());
    }
}
