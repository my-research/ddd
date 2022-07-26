package com.example.layer.application;

import com.example.layer.core.Order;
import com.example.layer.model.SavedUser;
import com.example.layer.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderSaver {

    private static final String[] addressCandidates = {"seoul", "busan", "yeosu", "tokyo", "los angeles", "new york"};
    private int count = 0;
    private final OrderRepository repository;

    public SavedUser save() {
        Order order = Order.builder().address(addressCandidates[count++]).build();
        Order saved = repository.save(order);
        return SavedUser.of(saved.getId(), saved.getAddress());
    }
}
