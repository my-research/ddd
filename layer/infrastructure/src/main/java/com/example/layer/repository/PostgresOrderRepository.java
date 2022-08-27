package com.example.layer.repository;

import com.example.layer.domain.order.core.Order;
import com.example.layer.domain.order.repository.OrderRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostgresOrderRepository implements OrderRepository {

    private final SpringDataJpaOrderRepository repository;

    @Override
    public Order save(Order order) {
        SpringDataJpaOrderEntity entity = repository.save(SpringDataJpaOrderEntity.convert(order));
        return SpringDataJpaOrderEntity.convert(entity);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }
}
