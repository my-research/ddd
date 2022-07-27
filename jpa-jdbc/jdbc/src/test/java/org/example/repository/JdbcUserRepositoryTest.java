package org.example.repository;

import java.util.ArrayList;
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
    void name() throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
            User user = repository.findById(10L).get();
            user.add();
            User save = repository.save(user);
            System.out.println("save = " + save);
        }
    }
}