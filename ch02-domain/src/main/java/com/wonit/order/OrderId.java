package com.wonit.order;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Value;

@Value(staticConstructor = "of")
public class OrderId implements Serializable {
    @Column(name = "id")
    Long value;
}
