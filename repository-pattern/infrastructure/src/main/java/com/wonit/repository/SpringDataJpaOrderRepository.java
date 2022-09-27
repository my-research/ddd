package com.wonit.repository;

import com.wonit.entity.SpringDataJpaOrderEntity;
import java.util.Optional;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaOrderRepository extends ElasticsearchRepository<SpringDataJpaOrderEntity, Long> {
    SpringDataJpaOrderEntity save(SpringDataJpaOrderEntity entity);
    Optional<SpringDataJpaOrderEntity> findByUserId(Long id);
}
