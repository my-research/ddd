package org.example.repository;

import java.util.LinkedList;
import java.util.List;
import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;
import org.example.entity.Infos;
import org.example.entity.User;
import org.example.persistence.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jdbc2UserRepositoryTest {
    @Autowired
    UserRepository repository;

    @Test
    void name1() {
        User jangwonik = User.builder()
                .id(10L)
                .name("jangwonik")
                .info(Infos.of(new LinkedList<>()))
                .build();
        repository.save(jangwonik);
    }

    @Test
    void name() throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
            User user = repository.findById(10L).get();
            user.pop();
            User save = repository.save(user);
            System.out.println(save);
        }
    }
}