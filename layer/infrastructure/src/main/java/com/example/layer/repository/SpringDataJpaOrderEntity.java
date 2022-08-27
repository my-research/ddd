package com.example.layer.repository;

import com.example.layer.domain.order.core.OrderItems;
import com.example.layer.domain.order.core.OrderStatus;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@NoArgsConstructor
public class SpringDataJpaOrderEntity {

    @Id
    private Long id;
    private String address;
    // private OrderItems orderItems;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
