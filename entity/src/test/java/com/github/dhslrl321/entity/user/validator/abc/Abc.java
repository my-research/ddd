package com.github.dhslrl321.entity.user.validator.abc;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Abc {
    @Test
    void name() {
        User user = new User(0);

        Age age = user.getAge();
        age.plus();

        assertThat(user.getAge()).isEqualTo(new Age(0));
        assertThat(age).isEqualTo(new Age(1));
    }
}

@Getter
class User {
    Age age;

    public User(int i) {
        this.age = new Age(i);
    }
}

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
class Age {
    private int age;

    void plus() {
        this.age++;
    }
}
