package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table(name = "users")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @PersistenceCreator)
@EqualsAndHashCode
public class User {
    @Id
    private Long id;
    @With
    private String name;
    private Infos infos;

    @Version
    private Integer version;

    public void pop() {
        infos.pop();
    }
}
