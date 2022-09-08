package com.example.arginjeciton;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePaulImpl implements GreetingService
{
    @Override
    public String greet()
    {
        return "Hello from Paul!";
    }
}
