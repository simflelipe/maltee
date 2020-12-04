package com.simfle.maltee.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<LineItem> lineItems = new ArrayList<>();

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private ShippingAddress shippingAddress;

    public void addLineItem(LineItem lineItem) {
        lineItem.setOrder(this);
        this.lineItems.add(lineItem);
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        shippingAddress.setOrder(this);
        this.shippingAddress = shippingAddress;
    }
}
