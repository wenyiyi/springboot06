package com.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication注解相当于同时使用@EnableAutoConfiguration、@ComponentScan、@Configurations三个注解
//@EnableAutoConfiguration用于打开SpringBoot自动配置，而其余注解为Spring注解
@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}

