package com.daniel.springbootthymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // http://localhost:8080/
    @GetMapping("/")
    public String index(){
        return "/index";
    }
    
}
