package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

//https://www.logicbig.com/tutorials/spring-framework/spring-cloud/hello-world.html

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        //System.out.println("=============");
        //SpringApplication.run(EurekaServerApplication.class, args);
        new SpringApplicationBuilder(EurekaServerApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}

//    @GetMapping("/user/hello")
//    public String hello(){
//        return "hello";
//    }
//
//    @Autowired
//    DiscoveryClient client;
//
//    @RequestMapping("/hellos")
//    public String hellos() {
//        List<ServiceInstance> instances = client.getInstances("HelloServer");
//
//        System.out.println("========================================"+instances.size());
//
//        ServiceInstance selectedInstance = instances
//                .get(new Random().nextInt(instances.size()));
//        return "Hello World: " + selectedInstance.getServiceId() + ":" + selectedInstance
//                .getHost() + ":" + selectedInstance.getPort();
//    }

