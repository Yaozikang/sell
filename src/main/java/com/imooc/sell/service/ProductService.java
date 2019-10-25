package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

/**
 * 商品详细信息查找接口
 */
public interface ProductService {

    /**
     * 查找指定ID的商品方法
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 查找已上架的所有商品方法
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查找所有商品方法
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 添加商品方法
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
