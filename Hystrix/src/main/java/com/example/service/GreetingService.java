package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {
    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) {
        return new RestTemplate().getForObject("http://localhost:9090/greeting/{username}", String.class, username);
    }

    @SuppressWarnings("unused")
    private String defaultGreeting(String username) {
        return "Hello User!";
    }
}
