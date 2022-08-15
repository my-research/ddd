package com.wonit.domain.event;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OrderCanceled extends DomainEvent {

    public static OrderCanceled of(Long orderId) {
        return new OrderCanceled(orderId);
    }

    private final Long orderId;

    private OrderCanceled(Long orderId) {
        super();
        this.orderId = orderId;
    }
}
