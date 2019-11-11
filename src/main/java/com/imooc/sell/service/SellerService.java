package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

/**
 * @author 要子康
 * @description SellerService
 * @since 2019/11/11 10:07
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
