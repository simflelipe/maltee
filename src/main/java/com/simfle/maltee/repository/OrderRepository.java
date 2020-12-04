package com.simfle.maltee.repository;

import com.simfle.maltee.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> , OrderCustomRepository{

}
