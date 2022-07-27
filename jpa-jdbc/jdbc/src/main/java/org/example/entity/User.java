package org.example.entity;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.sql.LockMode;
import org.springframework.data.relational.repository.Lock;

@Table(name = "users")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    private Long id;
    @With
    private String name;
    private Infos infos;

    private int addOffset;
    private int publishOffset;

    /*@Version
    private Integer version;*/

    private static final AtomicInteger atomicInteger = new AtomicInteger();
    public void add() {
        int i = atomicInteger.incrementAndGet();
        addOffset = i;
        infos.add(i);
    }
}
