package com.wonit;

import com.wonit.order.core.Order;
import com.wonit.order.value.OrderId;
import com.wonit.order.OrderRepository;
import org.springframework.data.repository.Repository;

public interface JpaOrderRepository extends Repository<Order, OrderId>, OrderRepository {
}
