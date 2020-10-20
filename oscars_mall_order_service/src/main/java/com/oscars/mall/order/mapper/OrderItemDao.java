package com.oscars.mall.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oscars.mall.order.entity.OrderItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 20:27:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
