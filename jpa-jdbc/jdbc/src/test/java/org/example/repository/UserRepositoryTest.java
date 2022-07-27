package org.example.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import org.example.entity.Info;
import org.example.entity.Infos;
import org.example.entity.User;
import org.example.persistence.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository repository;

    @Test
    void name() {
        ArrayList<Info> infos = new ArrayList<>();
        infos.add(Info.of("this"));
        infos.add(Info.of("is"));
        infos.add(Info.of("test"));

        User user = User.builder()
                .id(10L)
                .name("jang")
                .info(Infos.of(infos))
                .build();

        repository.save(user);
    }
}