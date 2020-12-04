package com.simfle.maltee.event;

import com.simfle.maltee.domain.Stock;
import lombok.Getter;

public class StockCreatedEvent {

    @Getter
    private Stock stock;

    public StockCreatedEvent(Stock stock) {
        this.stock = stock;
    }
}
