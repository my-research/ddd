package org.example.entity;

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

import java.util.List;

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

    @Version
    private Integer version;

    public List<String> pop() {
        List<String> pop = infos.pop(addOffset, publishOffset);
        publishOffset = addOffset;
        return pop;
    }
}
