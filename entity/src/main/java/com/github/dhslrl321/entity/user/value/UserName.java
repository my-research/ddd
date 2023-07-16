package com.github.dhslrl321.entity.user.value;

import lombok.Value;

import static org.valid4j.Validation.validate;

@Value(staticConstructor = "of")
public class UserName {

    String value;

    // 객체의 행위
    public UserName change(String target) {
        // 객체의 자기 캡슐화
        validate(target.length() > 0, new IllegalArgumentException("이름은 0자 이상이어야 합니다"));
        validate(target.length() <= 6, new IllegalArgumentException("이름은 6자 이하여야 합니다"));

        return UserName.of(target);
    }

    public boolean startsWith(String value) {
        return this.value.startsWith(value);
    }
}
