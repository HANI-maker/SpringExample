package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    
    @GetMapping("/hello2")
    public String hello() {
        long sum = 0;    
        for (int i = 0; i < 1_000_000; i++) {
            sum += Math.sqrt(i); // CPU 연산 부하
        }
        return "CPU load done: " + sum;
    }
}
