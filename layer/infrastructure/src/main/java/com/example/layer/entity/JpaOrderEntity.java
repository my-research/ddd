package com.example.layer.entity;

import com.example.layer.core.Order;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orders")
public class JpaOrderEntity extends Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long orderId;
    private final String type;

    public JpaOrderEntity(Long id, String address, Long orderId, String type) {
        super(id, address);
        this.orderId = orderId;
        this.type = type;
    }
}
