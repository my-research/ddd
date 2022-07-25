package com.example.layer.repository;

import com.example.layer.core.Order;

public interface OrderRepository {
    Order findByAddress(String address);
}
