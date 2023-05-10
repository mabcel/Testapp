package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//default scan within a same
//package or other packages but
//it must be sub package of current package
@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithThymeleafApplication.class, args);
		System.out.println("Spring boot up");
	}

}
