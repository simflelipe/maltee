package com.simfle.maltee.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_stock") //재고
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    //Item 수량




}
