package com.github.dhslrl321.entity.order;

import lombok.AllArgsConstructor;

public class Order {
    private final OrderId id;
    private final OrderLines orderLines;
    private final Promotions appliedPromotions;
    private final Price totalPrice;

    // 생성 방법을 factory 에서만 하도록 제한하기 위해 protected
    protected Order(OrderId id, OrderLines orderLines, Promotions appliedPromotions, Price totalPrice) {
        this.id = id;
        this.orderLines = orderLines;
        this.appliedPromotions = appliedPromotions;
        this.totalPrice = totalPrice;
    }
}
