package com.simfle.maltee.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_stock_order")
public class StockOrder {

    @Id
    @GeneratedValue
    private Long id;
}
