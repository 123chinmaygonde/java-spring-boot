package com.spring_boot.spring_boot;


import org.springframework.stereotype.Component;

@Component
public class Developer {

    public void building(){
        System.out.println("dependecy injection in spring boot");
    }
}
