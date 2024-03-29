package com.wonit.order;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findByUserId(long userId);
}
