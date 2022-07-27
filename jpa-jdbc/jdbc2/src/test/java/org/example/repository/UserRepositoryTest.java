package org.example.repository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import ch.qos.logback.core.util.TimeUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.assertj.core.api.Assertions;
import org.example.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository repository;
    @Test
    void save() {
        User user1 = User.builder().id(10L).name("foo").build();
        User save = repository.save(user1);
        assertThat(save).isNotNull();
    }

    @Test
    void add() {
        User user1 = User.builder().id(10L).name("foo").build();
        User save = repository.save(user1);

        User user = repository.findById(save.getId()).get();
        assertThat(save).isEqualTo(user);
    }

    @Test
    void xxxx() throws Exception {

//        User user1 = User.builder().id(10L).name("foo").build();
//        User save = repository.save(user1);
        System.out.println("Start > user Name ");
        List<Callable<Void>> callables = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(2);



        callables.add(() -> {
            while (true){
                User user = repository.findById(10L).get();
                TimeUnit.SECONDS.sleep(1);
                    User bar = repository.save(user.withName("foo"));
                    System.out.println("Callable1 > user Name " + bar.getName());

            }

        });

        callables.add(() -> {
            while (true){
                User user = repository.findById(10L).get();
                TimeUnit.SECONDS.sleep(1);
                    User bar = repository.save(user.withName("bar"));
                    System.out.println("Callable2 > user Name " + bar.getName());
            }
        });

        executorService.invokeAll(callables);
        executorService.shutdown();
    }

    @Test
    void jdbc2() throws InterruptedException {
        while (true) {
            // TimeUnit.SECONDS.sleep(1);
            Thread.sleep(10);
            User user = repository.findById(10L).get();
            if (user.getName().equals("foo")) {
                User bar = user.withName("bar");
                User save = repository.save(bar);
                System.out.println(save);
            }
        }
    }
}