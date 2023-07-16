package com.github.dhslrl321.entity.user.value;

import lombok.Value;

import java.util.regex.Pattern;

import static org.valid4j.Validation.validate;

@Value
public class Email {

    public static final Pattern EMAIL_REGEX_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

    public static Email of(String value) {

        boolean validEmail = EMAIL_REGEX_PATTERN
                .matcher(value)
                .matches();

        validate(validEmail, new IllegalArgumentException("invalid email"));

        return new Email(value);
    }

    String value;

    public String emailId() {
        return value.split("@")[0];
    }
}
