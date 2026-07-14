package com.github.sergiooliveirabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Obsolete Framework (Spring Boot 2.7.18)");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Execution Signal: Running in a legacy ecosystem but compatible with JDK 17 (Spring Boot 2.7.18)!";
    }
}