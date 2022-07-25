package com.example.layer.repository;

import com.example.layer.entity.JpaOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface JpaOrderRepository extends CrudRepository<JpaOrderEntity, Long> {
}
