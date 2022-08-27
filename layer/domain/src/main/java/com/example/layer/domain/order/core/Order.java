package com.example.layer.domain.order.core;

import com.wonit.layer.util.TimeBasedIdGenerator;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Order  {

    public static Order newInstance(String address, OrderItems orderItems) {
        Long id = TimeBasedIdGenerator.gen();
        return new Order(id, address, orderItems, OrderStatus.WAITING, LocalDateTime.now());
    }

    public static Order of(Long id, String address, OrderItems orderItems, OrderStatus status, LocalDateTime createdAt) {
        return new Order(id, address, orderItems, status, createdAt);
    }

    private Long id;
    private String address;
    private OrderItems orderItems;
    private OrderStatus status;
    private LocalDateTime createdAt;

    public int getTotalQuantity() {
        return orderItems.stream()
                .mapToInt(OrderItem::getQuantity)
                .sum();
    }

    public void cancel() {
        status = OrderStatus.CANCELED;
    }
}
