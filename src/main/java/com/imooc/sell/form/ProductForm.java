package com.imooc.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 要子康
 * @description ProductForm
 * @since 2019/11/8 22:25
 */
@Data
public class ProductForm {

    private String productId;

    /** 名字*/
    private String productName;

    /** 单价*/
    private BigDecimal productPrice;

    /** 库存*/
    private Integer productStock;

    /** 描述*/
    private String productDescription;

    /** 图片*/
    private String productIcon;

    /** 类目编号*/
    private Integer categoryType;

}
