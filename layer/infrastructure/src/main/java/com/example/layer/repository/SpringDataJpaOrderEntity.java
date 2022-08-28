package com.example.layer.repository;

import com.example.layer.domain.order.core.Order;
import com.example.layer.domain.order.core.OrderItem;
import com.example.layer.domain.order.core.OrderItems;
import com.example.layer.domain.order.core.OrderStatus;
import com.example.layer.repository.util.OrderItemConverter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SpringDataJpaOrderEntity  {

    public static SpringDataJpaOrderEntity convert(Order order) {
        List<SpringDataJpaOrderItem> items = order.getOrderItems().stream()
                .map(i -> SpringDataJpaOrderItem.of(i.getProductId(), i.getQuantity()))
                .collect(Collectors.toList());
        return new SpringDataJpaOrderEntity(order.getId(), order.getAddress(), items, order.getStatus(), order.getCreatedAt());
    }

    public static Order convert(SpringDataJpaOrderEntity entity) {
        List<OrderItem> items = entity.getOrderItems().stream()
                .map(i -> OrderItem.of(i.getProductId(), i.getQuantity()))
                .collect(Collectors.toList());
        return Order.of(entity.getId(), entity.getAddress(), OrderItems.of(items), entity.getStatus(), entity.getCreatedAt());
    }

    @Id
    private Long id;
    private String address;
    @Convert(converter = OrderItemConverter.class)
    private List<SpringDataJpaOrderItem> orderItems;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private LocalDateTime createdAt;
}
