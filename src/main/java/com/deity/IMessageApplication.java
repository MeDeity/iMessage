package com.deity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.deity")
public class IMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMessageApplication.class, args);
	}
}
