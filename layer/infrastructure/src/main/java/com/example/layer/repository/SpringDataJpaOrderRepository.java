package com.example.layer.repository;

import com.example.layer.domain.order.repository.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaOrderRepository extends JpaRepository<SpringDataJpaOrderEntity, Long> {
}
