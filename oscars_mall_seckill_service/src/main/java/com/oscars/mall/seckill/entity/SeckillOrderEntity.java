package com.oscars.mall.seckill.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author qianmua
 * @email hjcwyhasgo@163.com
 * @date 2020-10-20 21:05:33
 */
@Data
@TableName("tb_seckill_order")
public class SeckillOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 * 秒杀商品ID
	 */
	private Long seckillId;
	/**
	 * 支付金额
	 */
	private BigDecimal money;
	/**
	 * 用户
	 */
	private String userId;
	/**
	 * 商家
	 */
	private String sellerId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 支付时间
	 */
	private Date payTime;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 收货人地址
	 */
	private String receiverAddress;
	/**
	 * 收货人电话
	 */
	private String receiverMobile;
	/**
	 * 收货人
	 */
	private String receiver;
	/**
	 * 交易流水
	 */
	private String transactionId;

}
