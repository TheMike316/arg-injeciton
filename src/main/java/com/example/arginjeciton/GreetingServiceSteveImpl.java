package com.example.arginjeciton;

import org.springframework.stereotype.Service;

@Service("greetingServiceSteve")
public class GreetingServiceSteveImpl implements GreetingService
{
    @Override
    public String greet()
    {
        return "Hello from Steve!";
    }

}
