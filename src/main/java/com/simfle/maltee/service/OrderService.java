package com.simfle.maltee.service;

import com.simfle.maltee.domain.Order;
import com.simfle.maltee.domain.OrderVO;

public interface OrderService {

    void save(Order order);
    void delete();
    OrderVO get(String orderId);
}
