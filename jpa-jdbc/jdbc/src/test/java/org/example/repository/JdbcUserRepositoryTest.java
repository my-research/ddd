package org.example.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.example.entity.Info;
import org.example.entity.Infos;
import org.example.entity.User;
import org.example.persistence.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JdbcUserRepositoryTest {
    @Autowired
    UserRepository repository;
    @Test
    void add() throws InterruptedException {
        while(true) {
            Thread.sleep(100);
            User user = repository.findById(10L).get();
            user.add();
            User save = repository.save(user);
            System.out.println("save = " + save);
        }
    }
    @Test
    void add_by_second() throws InterruptedException {
        while(true) {
            int second = LocalDateTime.now().getSecond();
            if ((second / 10) % 2 == 0) {
                Thread.sleep(100);
                User user = repository.findById(10L).get();
                user.add();
                User save = repository.save(user);
                System.out.println("save = " + save);
            }

        }
    }
}
