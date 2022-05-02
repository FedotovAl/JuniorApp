package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/greetings")
    public String getGreetings() {
        return "Greetings, traveler!!!";
    }
}