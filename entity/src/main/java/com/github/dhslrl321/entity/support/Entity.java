package com.github.dhslrl321.entity.support;

import com.github.dhslrl321.entity.validator.ViolationHandler;

public interface Entity {
    void validate(ViolationHandler handler);
}
