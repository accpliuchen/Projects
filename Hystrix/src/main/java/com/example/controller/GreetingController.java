package com.example.controller;

import com.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//public interface GreetingController {
//
//    @RequestMapping("/greeting/{username}")
//    String greeting(@PathVariable("username") String username);
//}

@Controller
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/get-greeting/{username}")
    public String getGreeting(Model model, @PathVariable("username") String username) {
        model.addAttribute("greeting", greetingService.getGreeting(username));
        return "greeting-view";
    }
}
