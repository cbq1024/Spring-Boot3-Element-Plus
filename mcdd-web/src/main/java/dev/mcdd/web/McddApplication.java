package dev.mcdd.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class McddApplication {
    public static void main(String[] args) {
        SpringApplication.run(McddApplication.class, args);
    }
}
