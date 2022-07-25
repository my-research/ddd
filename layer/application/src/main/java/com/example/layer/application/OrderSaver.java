package com.example.layer.application;

import com.example.layer.entity.JpaOrderEntity;
import com.example.layer.model.SavedUser;
import com.example.layer.repository.JpaOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderSaver {

    private static final String[] addressCandidates = {"seoul", "busan", "yeosu", "tokyo", "los angeles", "new york"};
    private int count = 0;
    private final JpaOrderRepository repository;

    public SavedUser save() {
        JpaOrderEntity entity = JpaOrderEntity.builder()
                .address(addressCandidates[count++])
                .build();
        JpaOrderEntity saved = repository.save(entity);
        return SavedUser.of(saved.getId(), saved.getAddress());
    }
}
