package com.example.ch01jpa.domain.core.order;

import lombok.Value;

@Value(staticConstructor = "of")
public class ShippingInfo {
    Receiver receiver;
}
