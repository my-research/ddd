package com.example.ch01jpa.persistence.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.ch01jpa.domain.core.goods.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@DataJpaTest
class GoodsRepositoryTest {

    @Autowired
    GoodsRepository sut;

    @Test
    void name() {
        Goods saved = sut.save(Goods.builder().manufacturer(Manufacturer.of(Origin.of("origin"), Location.of("location"))).build());
        Goods found = sut.findById(saved.getId()).orElseThrow();
        System.out.println("found = " + found);
         // assertThat(saved).isEqualTo(found);
    }
}