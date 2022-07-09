package com.example.ch01jpa.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    @Embedded
    private Receiver receiver;

    public Order(String address, Receiver receiver) {
        this.address = address;
        this.receiver = receiver;
    }

    public static Order of(String address, Receiver receiver, EventFactory eventFactory) {
        Order order = new Order(address, receiver);
        // OrderReceived event = EventFactory.orderReceived(order);
        eventFactory.orderReceivedNonStatic(order);
        return order;
    }

    /**
     * 테스트 대상
     */
    public String getAddress() {
        return address;
    }
}
