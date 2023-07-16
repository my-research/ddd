package com.github.dhslrl321.entity.validator;

public class ViolationHandler {
    public void handle(String message) {
        throw new IllegalStateException(message);
    }
}
