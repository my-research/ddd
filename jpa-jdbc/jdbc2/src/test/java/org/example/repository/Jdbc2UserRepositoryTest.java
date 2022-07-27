package org.example.repository;

import java.time.LocalDateTime;
import org.example.entity.Infos;
import org.example.entity.User;
import org.example.persistence.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;

@SpringBootTest
class Jdbc2UserRepositoryTest {
    @Autowired
    UserRepository repository;

    @Test
    void name1() {
        User jangwonik = User.builder()
                .id(10L)
                .name("jangwonik")
                .infos(Infos.of(new LinkedList<>()))
                .build();

        repository.save(jangwonik);
    }

    @Test
    void pop() throws InterruptedException {
        while (true) {
            Thread.sleep(100);
            User user = repository.findById(10L).get();
            user.pop();
            User save = repository.save(user);
            System.out.println(save);
        }
    }

    @Test
    void pop_by_second() throws InterruptedException {
        while (true) {
            int second = LocalDateTime.now().getSecond();
            if ((second / 10) % 2 != 0) {
                Thread.sleep(100);
                User user = repository.findById(10L).get();
                user.pop();
                User save = repository.save(user);
                System.out.println(save);
            }
        }
    }
}
