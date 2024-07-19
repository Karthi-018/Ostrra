package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppCnfig.class);
		gamerunner gn = (gamerunner) ac.getBean("gr");
		gn.run();
		
	}

}
