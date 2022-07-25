package com.example.layer.application;

import com.example.layer.core.Order;
import com.example.layer.entity.JpaOrderEntity;
import com.example.layer.model.UpdatedUser;
import com.example.layer.repository.JpaOrderRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderUpdater {
    private final JpaOrderRepository repository;

    @Transactional
    public UpdatedUser update(Long userId) {
        JpaOrderEntity entity = repository.findById(userId).orElseThrow();
        Order order = entity.toOrder();
        order.decorateAddress();
        JpaOrderEntity updatedUserEntity = JpaOrderEntity.from(order);
        JpaOrderEntity saved = repository.save(updatedUserEntity);

        return UpdatedUser.of(saved.getId(), saved.getAddress());
    }
}
