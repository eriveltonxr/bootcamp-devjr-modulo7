package com.abutua.productbackend.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    
   
    @GetMapping("hello")
    public String getHello(){
        return "Hello Spring Boot";
    }
}
