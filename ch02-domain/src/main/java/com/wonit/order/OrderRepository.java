package com.wonit.order;

import com.wonit.order.core.Order;
import java.util.List;

public interface OrderRepository {
    Order save(Order order);
    List<Order> findAll();
}
