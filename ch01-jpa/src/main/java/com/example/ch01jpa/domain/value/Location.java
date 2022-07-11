package com.example.ch01jpa.domain.value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@Getter
@ToString
public class Location {
    @Column(name = "location")
    String value;

    private Location(String value) {
        this.value = value;
    }

    public static Location of(String value) {
        return new Location(value);
    }
}
