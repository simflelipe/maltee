package com.simfle.maltee.service;


import com.simfle.maltee.domain.Order;
import com.simfle.maltee.domain.OrderVO;
import com.simfle.maltee.event.OrderCreatedEvent;
import com.simfle.maltee.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ApplicationEventPublisher eventPublisher) {
        this.orderRepository = orderRepository;
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
        eventPublisher.publishEvent(new OrderCreatedEvent(order));
    }

    @Override
    public void delete() {

    }

    @Override
    public OrderVO get(String orderId) {
        return orderRepository.getOrderVO(orderId);
    }
}
