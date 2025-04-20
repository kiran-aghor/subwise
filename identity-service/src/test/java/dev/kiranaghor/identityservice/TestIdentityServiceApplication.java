package dev.kiranaghor.identityservice;

import org.springframework.boot.SpringApplication;

public class TestIdentityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(IdentityServiceApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}
