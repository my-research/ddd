package com.example.layer.repository;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Embeddable;
import lombok.Value;

@Embeddable
@Value(staticConstructor = "of")
public class SpringDataJpaOrderItem {
    Long productId;
    int quantity;

    @JsonCreator
    public SpringDataJpaOrderItem(@JsonProperty("productId") Long productId,
                                  @JsonProperty("quantity") int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
