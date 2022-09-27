package com.wonit.entity;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpringDataJpaOrderEntity {
    @Id
    private Long id;
    private Long userId;
    @ElementCollection
    private List<Long> orderItems;
    private Long totalPrice;
}
