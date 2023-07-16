package com.wonit.domain;

import static com.wonit.domain.OrderStatus.CANCELED;
import static com.wonit.domain.OrderStatus.CREATED;

import com.wonit.domain.event.OrderCanceled;
import com.wonit.domain.event.util.Events;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {

    public static Order create() {
        return new Order();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status = CREATED;

    public void cancel() {
        OrderCanceled event = OrderCanceled.of(id);
        Events.raise(event);
        status = CANCELED;
    }
}
