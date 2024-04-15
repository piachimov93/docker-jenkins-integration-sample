package com.piachimov.demospringbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringBootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootDockerApplication.class, args);
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Test Hello World";
    }
}
