package com.example.ch01jpa.domain.value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@Getter
@ToString
public class Origin {
    @Column(name = "origin")
    private String value;

    private Origin(String value) {
        this.value = value;
    }

    public static Origin of(String value) {
        return new Origin(value);
    }
}
