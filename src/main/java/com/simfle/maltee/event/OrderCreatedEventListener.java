package com.simfle.maltee.event;

import com.simfle.maltee.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class OrderCreatedEventListener {

    private static final Logger logger = LoggerFactory.getLogger(OrderCreatedEventListener.class);

    @Autowired
    private StockService stockService;

    //StockService Save
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, classes = OrderCreatedEvent.class)
    public void handle(OrderCreatedEvent event) {
        logger.debug("OrderCreatedEventListner {}", event.getOrder());
    }

    //OrderServie Rollback
    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK, classes = OrderCreatedEvent.class)
    public void handleRollback(OrderCreatedEvent event) {
        logger.debug("OrderCreatedEventListner {}", event.getOrder());
    }
}
