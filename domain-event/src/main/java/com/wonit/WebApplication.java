package com.wonit;

import com.wonit.application.OrderMembershipFixtureService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class WebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WebApplication.class, args);

        OrderMembershipFixtureService service = context.getBean("orderMembershipFixtureService",
                OrderMembershipFixtureService.class);

        service.initializeFixture();
    }
}
