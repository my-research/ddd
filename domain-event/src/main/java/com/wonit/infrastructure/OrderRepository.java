package com.wonit.infrastructure;

import com.wonit.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
