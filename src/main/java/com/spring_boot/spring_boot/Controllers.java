package com.spring_boot.spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @RequestMapping("/")

    public String homeController(){
        return "this will handle home page request";
    }

    @RequestMapping("/about")
    public String aboutController(){
        return "this will handle about page request";
    }

    @RequestMapping("/phone")
    public String phoneController(){
        return "this will handle phone page request";
    }
}
