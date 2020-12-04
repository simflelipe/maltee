package com.simfle.maltee.domain;

import lombok.Data;


@Data
public class OrderVO {

    private Long orderId;

    private String productId;

    private String zipCode;

    private String recipient;

    public OrderVO(Long orderId, String productId, String zipCode, String recipient) {
        this.orderId = orderId;
        this.productId = productId;
        this.zipCode = zipCode;
        this.recipient = recipient;
    }
}
