package com.simfle.maltee.repository;

import com.simfle.maltee.domain.OrderVO;

public interface OrderCustomRepository {
    OrderVO getOrderVO(String orderId);
}
