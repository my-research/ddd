package com.github.dhslrl321.domain;

import com.github.dhslrl321.domain.event.UserCreated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class User extends AbstractAggregateRoot<User> {

    public User(String username, String email) {
        this.username = username;
        this.email = email;

        registerEvent(new UserCreated(this));
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String email;
}
