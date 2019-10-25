package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 商品类目查找接口
 */
public interface CategoryService {

    /**
     * 查找指定ID的商品类目
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找所有商品类目
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 查找指定集合的商品类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 添加商品类目
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
