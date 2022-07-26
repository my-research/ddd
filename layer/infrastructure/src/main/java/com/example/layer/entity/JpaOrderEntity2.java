package com.example.layer.entity;

import com.example.layer.core.Order;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class JpaOrderEntity2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;

    public Order toOrder() {
        return Order.builder()
                .id(this.id)
                .address(this.address)
                .build();
    }

    public static JpaOrderEntity2 from(Order order) {
        return JpaOrderEntity2.builder()
                .id(order.getId())
                .address(order.getAddress())
                .build();
    }
}
