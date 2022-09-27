package com.wonit.repository;

import com.wonit.entity.SpringDataJpaOrderEntity;
import com.wonit.order.Order;
import java.util.Optional;
import org.springframework.data.repository.Repository;

public interface SpringDataJpaOrderRepository extends Repository<SpringDataJpaOrderEntity, Long> {
    SpringDataJpaOrderEntity save(SpringDataJpaOrderEntity entity);
    Optional<SpringDataJpaOrderEntity> findById(Long id);
}
