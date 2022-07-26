package com.example.layer.repository;

import com.example.layer.core.Order;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(Long id);
    Order save(Order order);
}
