package com.wonit.order;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@NoArgsConstructor
@Getter
public class Order {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.AUTO)
    private OrderId id;
    private String address;

    public Order(Long id, String address) {
        this.id = OrderId.of(id);
        this.address = address;
    }
}
