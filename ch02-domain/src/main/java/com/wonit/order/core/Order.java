package com.wonit.order.core;

import com.wonit.order.value.OrderId;
import com.wonit.order.value.Orderer;
import com.wonit.order.value.ShippingInfo;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;

@Entity(name = "purchase_order")
@Getter
public class Order {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.AUTO)
    OrderId id;
    @Embedded
    Orderer orderer;
    @Embedded
    ShippingInfo shippingInfo;
}
