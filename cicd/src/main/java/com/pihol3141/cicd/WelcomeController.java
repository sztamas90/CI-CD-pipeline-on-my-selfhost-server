package com.pihol3141.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String sayHi(){
        return "Hi, welcome";
    }
}
