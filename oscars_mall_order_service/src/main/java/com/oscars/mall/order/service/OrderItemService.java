package com.oscars.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oscars.common.utils.PageUtils;
import com.oscars.mall.order.entity.OrderItemEntity;


import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 20:27:34
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

