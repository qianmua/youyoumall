package com.oscars.mall.web.service.impl;

import com.oscars.common.utils.R;
import com.oscars.mall.goods.service.GoodsRPCService;
import com.oscars.mall.web.service.GoodsService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.cluster.Constants;
import org.springframework.stereotype.Component;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/10/16  16:52
 * @description :
 */
@Component
public class GoodsServiceImpl implements GoodsService {

    @Reference( check = false , loadbalance = Constants.LOADBALANCE_KEY)
    private GoodsRPCService goodsRPCService;

    @Override
    public R queryAllTest() {
        return goodsRPCService.queryAllTest();
    }
}
