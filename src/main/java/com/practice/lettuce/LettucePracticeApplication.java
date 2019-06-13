package com.practice.lettuce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LettucePracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LettucePracticeApplication.class, args);
    }
}
