package com.example.ch01jpa.persistence.repository;

import com.example.ch01jpa.domain.core.goods.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
