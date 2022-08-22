package com.example.layer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(WebApplication.class, args);

        Object orderController = context.getBean("orderController");
    }

}
