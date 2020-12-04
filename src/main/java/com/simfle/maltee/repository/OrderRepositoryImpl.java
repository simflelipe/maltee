package com.simfle.maltee.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import com.simfle.maltee.domain.*;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl extends QuerydslRepositorySupport implements OrderCustomRepository {

    public OrderRepositoryImpl() {
        super(Order.class);
    }


    @Override
    public OrderVO getOrderVO(String orderId) {

        QOrder order = QOrder.order;
        QLineItem lineItem = QLineItem.lineItem;
        QShippingAddress shippingAddress = QShippingAddress.shippingAddress;

        JPQLQuery<OrderVO> query = from(order).innerJoin(order.lineItems, lineItem)
                .innerJoin(order.shippingAddress, shippingAddress)
                .select(Projections.constructor(OrderVO.class,
                        order.id,
                        lineItem.productId,
                        shippingAddress.zipCode,
                        shippingAddress.recipient)).limit(1);

        return query.fetchOne();
    }
}
