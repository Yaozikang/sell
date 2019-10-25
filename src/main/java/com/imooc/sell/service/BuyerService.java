package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author 要子康
 * @description BuyerService
 * @since 2019/10/17 20:35
 */
public interface BuyerService {

    /**
     * 查询一个订单
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
