package com.example.layer.repository;

import com.example.layer.core.Order;
import org.springframework.data.repository.Repository;

public interface JpaOrderRepository extends Repository<Order, Long>, OrderRepository {
}
