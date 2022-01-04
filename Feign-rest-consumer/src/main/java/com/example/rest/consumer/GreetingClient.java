package com.example.rest.consumer;

import com.example.hystrix.rest.producer.GreetingController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

//https://www.jianshu.com/p/bbe0fcc18d8e
@FeignClient(name = "rest-producer", url = "http://localhost:9090", fallback = GreetingClient.GreetingClientFallback.class)
public interface GreetingClient extends GreetingController {
    @Component
    public static class GreetingClientFallback implements GreetingClient {
        @Override
        public String greeting(@PathVariable("username") String username) {
            return "Hello User!";
        }
    }
}

