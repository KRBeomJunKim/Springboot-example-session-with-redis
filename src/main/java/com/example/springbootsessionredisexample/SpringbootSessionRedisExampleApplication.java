package com.example.springbootsessionredisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@SpringBootApplication
@RestController
public class SpringbootSessionRedisExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSessionRedisExampleApplication.class, args);
    }

    @GetMapping("/")
    public String home(HttpSession session) {
        return session.getId();
    }

}
