package com.qa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/") // this annotation is for specifying the url that will then trigger this method
    public String home(){
        return "Hello everyone";
    }

}
