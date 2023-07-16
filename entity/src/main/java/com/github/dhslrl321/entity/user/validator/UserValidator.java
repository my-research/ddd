package com.github.dhslrl321.entity.user.validator;

import com.github.dhslrl321.entity.user.User;
import com.github.dhslrl321.entity.user.value.Email;
import com.github.dhslrl321.entity.user.value.UserName;
import com.github.dhslrl321.entity.validator.ViolationHandler;
import com.github.dhslrl321.entity.validator.Validator;

public class UserValidator extends Validator {

    private final User user;

    public UserValidator(User user, ViolationHandler handler) {
        super(handler);
        this.user = user;
    }

    @Override
    public void validate() {
        if (this.notSatisfyEmailCondition(this.user)) {
            this.notificationHandler().handle("username 생성 제약조건에 통과하지 못하였습니다");
        }

        // 다른 validation
    }

    private boolean notSatisfyEmailCondition(User user) {
        Email email = user.getEmail();
        UserName username = user.getUsername();

        return !username.startsWith(email.emailId());
    }
}
