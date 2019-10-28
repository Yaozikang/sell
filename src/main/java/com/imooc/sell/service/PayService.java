package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

public interface PayService {

    void create(OrderDTO orderDTO);
}
