package com.example.ch01jpa.domain.value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Manufacturer {
    private Origin origin;
    private Location location;

    private Manufacturer(Origin origin, Location location) {
        this.origin = origin;
        this.location = location;
    }

    public static Manufacturer of(Origin origin, Location location) {
        return new Manufacturer(origin, location);
    }
}
