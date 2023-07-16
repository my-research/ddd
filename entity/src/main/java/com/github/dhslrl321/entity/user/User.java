package com.github.dhslrl321.entity.user;

import com.github.dhslrl321.entity.support.Entity;
import com.github.dhslrl321.entity.user.validator.UserValidator;
import com.github.dhslrl321.entity.user.value.Email;
import com.github.dhslrl321.entity.user.value.UserId;
import com.github.dhslrl321.entity.user.value.UserName;
import com.github.dhslrl321.entity.validator.ViolationHandler;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE) // 객체 생성 방법을 하나로 일원화
public class User implements Entity {

    // 빠른 식별자 생성
    // 엔티티 생성을 위해 필요한 것들을 명확하게 나열
    public static User newInstance(UserId id, Email email, UserName name) {
        return new User(id, email, name);
    }

    // 속성은 유비쿼터스 랭귀지로부터 발견되는 것
    private final UserId id; // 식별자 안정성을 제공
    private final Email email;
    private UserName username; // 불변 객체를 통한 안정성 제공 (value object)

    // 객체의 행위
    public void changeUserName(String target) {
        username = username.change(target);
    }

    // 엔티티 스스로가 validation
    // 이렇게 하면 외부 바운디드 컨텍스트랑은 어떻게 하지? 침투할텐데
    @Override
    public void validate(ViolationHandler handler) {
        UserValidator validator = new UserValidator(this, handler);
        validator.validate();
    }
}
