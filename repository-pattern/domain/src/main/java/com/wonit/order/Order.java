package com.wonit.order;

import com.wonit.product.Product;
import com.wonit.util.LongIdGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Order {

    public static Order create(Long userId) {
        Long id = LongIdGenerator.gen();
        return new Order(id, userId, new ArrayList<>(), 0L, "Seoul");
    }

    public static Order by(Long id, Long userId, List<Long> orderItems, Long totalPrice) {
        return new Order(id, userId, orderItems, totalPrice, "");
    }

    private final Long id;
    private final Long userId;
    private List<Long> orderItems;
    private Long totalPrice;
    private final String address;

    public Order(Long id, Long userId, List<Long> orderItems, Long totalPrice, String address) {
        this.id = id;
        this.userId = userId;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
        this.address = address;
    }

    public void add(Product product) {
        orderItems.add(product.getId());

        totalPrice += product.getPrice();
    }
}
