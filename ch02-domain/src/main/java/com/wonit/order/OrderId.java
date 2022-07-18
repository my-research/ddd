package com.wonit.order;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.NoArgsConstructor;
import lombok.Value;

// @Value(staticConstructor = "of")
@Embeddable
public class OrderId implements Serializable {
    @Column(name = "id")
    Long value;

    private OrderId() {
    }

    private OrderId(Long value) {
        this.value = value;
    }

    public static OrderId of(Long value) {
        return new OrderId(value);
    }
}
