package com.github.dhslrl321.entity.user.validator;

import com.github.dhslrl321.entity.user.User;
import com.github.dhslrl321.entity.user.value.Email;
import com.github.dhslrl321.entity.user.value.UserId;
import com.github.dhslrl321.entity.user.value.UserName;
import com.github.dhslrl321.entity.validator.ViolationHandler;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class Username_UserValidatorTest {

    public static final UserId ANY = UserId.of(1);

    UserValidator sut;

    ViolationHandler handler = new ViolationHandler();

    @Test
    void satisfy() {
        User user = User.newInstance(ANY, Email.of("james@google.com"), UserName.of("james123"));

        sut = new UserValidator(user, handler);

        assertDoesNotThrow(() -> sut.validate());
    }

    @Test
    void not_satisfy() {
        User user = User.newInstance(ANY, Email.of("james@google.com"), UserName.of("lucy001"));

        sut = new UserValidator(user, new ViolationHandler());

        assertThatThrownBy(() -> sut.validate()).isInstanceOf(IllegalStateException.class)
                .hasMessage("username 생성 제약조건에 통과하지 못하였습니다");
    }
}
