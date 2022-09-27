package com.example.layer.repository.util;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.layer.repository.SpringDataJpaOrderItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import org.junit.jupiter.api.Test;

class GsonLearningTest {

    Gson sut = new Gson();

    SpringDataJpaOrderItem ORDER_ITEM_1 = SpringDataJpaOrderItem.of(1L, 2);
    SpringDataJpaOrderItem ORDER_ITEM_2 = SpringDataJpaOrderItem.of(2L, 4);
    List<SpringDataJpaOrderItem> ORDER_ITEMS = List.of(ORDER_ITEM_1, ORDER_ITEM_2);

    @Test
    void name() {
        String json = sut.toJson(ORDER_ITEM_1);
        SpringDataJpaOrderItem actual = sut.fromJson(json, SpringDataJpaOrderItem.class);

        assertThat(actual).isEqualTo(ORDER_ITEM_1);
    }

    @Test
    void name2() {
        String json = sut.toJson(ORDER_ITEMS);
        System.out.println("json = " + json);

        List<SpringDataJpaOrderItem> actual = sut.fromJson(json, new TypeToken<List<SpringDataJpaOrderItem>>() {}.getType());

        assertThat(ORDER_ITEMS).isEqualTo(actual);
    }
}