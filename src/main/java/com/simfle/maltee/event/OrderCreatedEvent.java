package com.simfle.maltee.event;


import com.simfle.maltee.domain.Order;
import lombok.Getter;

public class OrderCreatedEvent {

    @Getter
    private Order order;

    public OrderCreatedEvent(Order order) {
        this.order = order;
    }
}
