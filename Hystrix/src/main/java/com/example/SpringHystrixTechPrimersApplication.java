package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


//http://localhost:8080/hystrix.stream
@EnableHystrixDashboard
//@EnableHystrix
@SpringBootApplication
@EnableCircuitBreaker
public class SpringHystrixTechPrimersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHystrixTechPrimersApplication.class, args);
    }
}
