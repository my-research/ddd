package com.wonit.repository;

import com.wonit.entity.SpringDataJpaOrderEntity;
import com.wonit.order.Order;
import com.wonit.order.OrderRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpringDataJpaOrderRepositoryAdapter implements OrderRepository {

    private final SpringDataJpaOrderRepository repository;

    @Override
    public Order save(Order order) {
        SpringDataJpaOrderEntity entity = repository.save(convert(order));
        return convert(entity);
    }

    @Override
    public Optional<Order> findById(Long id) {
        Optional<SpringDataJpaOrderEntity> optional = repository.findById(id);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(convert(optional.get()));
    }

    private SpringDataJpaOrderEntity convert(Order domain) {
        return SpringDataJpaOrderEntity.builder()
                .id(domain.getId())
                .orderItems(domain.getOrderItems())
                .totalPrice(domain.getTotalPrice())
                .build();
    }

    private Order convert(SpringDataJpaOrderEntity entity) {
        return Order.by(entity.getId(),
                entity.getUserId(),
                entity.getOrderItems(),
                entity.getTotalPrice());
    }
}
