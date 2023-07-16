package com.github.dhslrl321.create;

import com.github.dhslrl321.domain.User;
import com.github.dhslrl321.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService {
    private final UserRepository repository;

    public void create(String username, String email) {
        User user = new User(username, email);

        repository.save(user);
    }
}
