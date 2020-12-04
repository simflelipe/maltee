package com.simfle.maltee.controller;


import com.simfle.maltee.domain.LineItem;
import com.simfle.maltee.domain.Order;
import com.simfle.maltee.domain.OrderVO;
import com.simfle.maltee.domain.ShippingAddress;
import com.simfle.maltee.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order_get/{orderId}")
    public ResponseEntity<OrderVO> getOrderVO(@PathVariable("orderId") String orderId) {
        OrderVO orderVO = orderService.get(orderId);
        return ResponseEntity.ok(orderVO);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<Void> listUsers(@PathVariable("orderId") String orderId) {
        Order order = new Order();
        order.addLineItem(new LineItem("P-0001"));
        order.addLineItem(new LineItem("P-0002"));
        order.setShippingAddress(new ShippingAddress("changhee", "yun"));
        orderService.save(order);
        return ResponseEntity.ok().build();
    }
}
