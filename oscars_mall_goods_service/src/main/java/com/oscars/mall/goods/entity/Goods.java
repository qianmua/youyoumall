package com.oscars.mall.goods.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author qianmuna
 * @since 2020-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_goods")
@ApiModel(value="Goods对象", description="")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商家ID")
    private String sellerId;

    @ApiModelProperty(value = "SPU名")
    private String goodsName;

    @ApiModelProperty(value = "默认SKU")
    private Long defaultItemId;

    @ApiModelProperty(value = "状态")
    private String auditStatus;

    @ApiModelProperty(value = "是否上架")
    private String isMarketable;

    @ApiModelProperty(value = "品牌")
    private Long brandId;

    @ApiModelProperty(value = "副标题")
    private String caption;

    @ApiModelProperty(value = "一级类目")
    private Long category1Id;

    @ApiModelProperty(value = "二级类目")
    private Long category2Id;

    @ApiModelProperty(value = "三级类目")
    private Long category3Id;

    @ApiModelProperty(value = "小图")
    private String smallPic;

    @ApiModelProperty(value = "商城价")
    private BigDecimal price;

    @ApiModelProperty(value = "分类模板ID")
    private Long typeTemplateId;

    @ApiModelProperty(value = "是否启用规格")
    private String isEnableSpec;

    @ApiModelProperty(value = "是否删除")
    private String isDelete;


}
