package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 继承JpaRepository的商品详细信息的接口
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 查找商品的上架状态方法
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
