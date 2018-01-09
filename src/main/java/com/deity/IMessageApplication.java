package com.deity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.deity")
//Field messageMapper in com.deity.controller.TestController
// required a bean of type 'com.deity.mapper.MessageMapper'
// that could not be found.
@MapperScan(basePackages = "com.deity.mapper")
public class IMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMessageApplication.class, args);
	}
}
