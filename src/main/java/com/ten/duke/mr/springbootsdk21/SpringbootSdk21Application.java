package com.ten.duke.mr.springbootsdk21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringbootSdk21Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSdk21Application.class, args);
    }

}
