package com.deity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.deity")
//--------使用MyBatis--------------------
// Field messageMapper in com.deity.controller.TestController
// required a bean of type 'com.deity.mapper.MessageMapper'
// that could not be found.
@MapperScan(basePackages = "com.deity.mapper")
//--------以下内容在使用JPA时需要使用------
@EnableJpaRepositories(basePackages = "com.deity.mapper")
@EntityScan(basePackages = "com.deity.entity")

public class IMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMessageApplication.class, args);
	}
}
