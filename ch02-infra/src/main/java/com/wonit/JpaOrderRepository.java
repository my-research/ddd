package com.wonit;

import com.wonit.order.Order;
import com.wonit.order.OrderId;
import com.wonit.order.OrderRepository;
import org.springframework.data.repository.Repository;

public interface JpaOrderRepository extends Repository<Order, OrderId>, OrderRepository {
}
