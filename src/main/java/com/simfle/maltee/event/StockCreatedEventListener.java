package com.simfle.maltee.event;

import com.simfle.maltee.service.OrderService;
import com.simfle.maltee.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

public class StockCreatedEventListener {

    @Autowired
    private StockService stockService;

    @Autowired
    private OrderService orderService;

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, classes = OrderCreatedEvent.class)
    public void handle(OrderCreatedEvent event) {

    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK, classes = OrderCreatedEvent.class)
    public void handleRollback(OrderCreatedEvent event) {
        orderService.delete();
    }
}
