package com.github.dhslrl321.entity.validator;

public abstract class Validator {
    private final ViolationHandler handler;

    public Validator(ViolationHandler handler) {
        this.handler = handler;
    }

    public abstract void validate();

    protected ViolationHandler notificationHandler() {
        return this.handler;
    }
}
