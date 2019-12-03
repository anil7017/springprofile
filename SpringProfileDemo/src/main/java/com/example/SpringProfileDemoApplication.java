package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileDemoApplication.class, args);
		System.out.println("application start.................");
		
		System.out.println(System.getProperty("java.io.tmpdir"));
		
	}

}
