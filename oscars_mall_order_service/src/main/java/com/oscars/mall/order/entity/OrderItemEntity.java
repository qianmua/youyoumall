package com.oscars.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 20:27:34
 */
@Data
@TableName("tb_order_item")
public class OrderItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long itemId;
	/**
	 * SPU_ID
	 */
	private Long goodsId;
	/**
	 * 订单id
	 */
	private Long orderId;
	/**
	 * 商品标题
	 */
	private String title;
	/**
	 * 商品单价
	 */
	private BigDecimal price;
	/**
	 * 商品购买数量
	 */
	private Integer num;
	/**
	 * 商品总金额
	 */
	private BigDecimal totalFee;
	/**
	 * 商品图片地址
	 */
	private String picPath;
	/**
	 * 
	 */
	private String sellerId;

}
