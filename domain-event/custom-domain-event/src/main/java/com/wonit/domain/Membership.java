package com.wonit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Membership {

    public static Membership by(Long orderId, String userPhoneNumber) {
        return new Membership(orderId, userPhoneNumber);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String userPhoneNumber;
    private Boolean available = true;

    private Membership(Long orderId, String userPhoneNumber) {
        this.orderId = orderId;
        this.userPhoneNumber = userPhoneNumber;
    }

    public void terminate() {
        available = false;
    }
}
