package com.example.ch01jpa.domain.core.order;

import com.example.ch01jpa.domain.value.Price;
import lombok.Value;

@Value(staticConstructor = "of")
public class OrderLine {
    Price price;
}
