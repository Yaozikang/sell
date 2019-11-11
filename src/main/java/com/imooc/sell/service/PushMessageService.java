package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author 要子康
 * 推送消息
 * @description PushMessageService
 * @since 2019/11/14 22:19
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
