package com.ocean.vampire;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.ocean.vampire")
@MapperScan("com.ocean.vampire.dao")
@SpringBootApplication
public class VampireApplication {

	public static void main(String[] args) {
		SpringApplication.run(VampireApplication.class, args);
	}
}
