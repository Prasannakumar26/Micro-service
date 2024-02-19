package com.example.microservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice")
public class MicroServiceController {

    @GetMapping("/hello")
    public String getData(){
        return "welcome to the microservice1";
    }
}
