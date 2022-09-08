package com.example.arginjeciton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class GreetingController
{
    private final GreetingService greetingServiceSteve;
    @GetMapping("/")
    public String getGreeting() {
        return greetingServiceSteve.greet();
    }
}
