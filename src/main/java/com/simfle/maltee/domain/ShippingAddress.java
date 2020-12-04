package com.simfle.maltee.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_shipping_address")
public class ShippingAddress {

    @Id
    @GeneratedValue
    private Long id;

    private String zipCode;

    private String recipient;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public ShippingAddress(String zipCode, String recipient) {
        this.zipCode = zipCode;
        this.recipient = recipient;
    }
}
