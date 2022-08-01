package com.example.layer.repository;

import com.example.layer.core.Order;
import com.example.layer.core.OrderRepository;
import org.springframework.data.repository.Repository;

public interface SpringDataJpaOrderRepository extends Repository<Order, Long>, OrderRepository {
}
