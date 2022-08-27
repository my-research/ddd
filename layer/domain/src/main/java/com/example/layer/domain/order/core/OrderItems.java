package com.example.layer.domain.order.core;

import java.util.List;
import java.util.stream.Stream;
import lombok.Value;

@Value(staticConstructor = "of")
public class OrderItems {
    List<OrderItem> items;

    public Stream<OrderItem> stream() {
        return items.stream();
    }

    public int size() {
        return items.size();
    }
}
