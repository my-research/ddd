package com.wonit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface JpaOrderRepository extends Repository<Order, OrderId>, OrderRepository {

}
