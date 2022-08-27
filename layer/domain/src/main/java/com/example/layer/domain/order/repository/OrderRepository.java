package com.example.layer.domain.order.repository;

import com.example.layer.domain.order.core.Order;
import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
}
