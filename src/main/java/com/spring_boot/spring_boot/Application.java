package com.spring_boot.spring_boot;

import org.springframework.context.ApplicationContext;  // ✅ Correct import
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
        Developer obj = context.getBean(Developer.class);
        obj.building();
	}

}
