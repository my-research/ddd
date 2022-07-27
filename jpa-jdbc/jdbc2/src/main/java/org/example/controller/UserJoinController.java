package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.User;
import org.example.persistence.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserJoinController {

    private final UserRepository repository;

    @GetMapping("/join")
    public String join() {
        User user = repository.save(User.builder()
                        .id(1L)
                        .name("jangwonik")
                        .addOffset(0)
                        .publishOffset(0)
                        .build()
        );

        return repository.save(user).toString();
    }
}
