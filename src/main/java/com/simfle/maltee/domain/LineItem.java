package com.simfle.maltee.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_line_item")
public class LineItem {

    @Id
    @GeneratedValue
    private Long id;

    private String productId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public LineItem(String productId) {
        this.productId = productId;
    }
}
