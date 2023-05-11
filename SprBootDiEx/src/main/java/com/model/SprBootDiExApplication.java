package com.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SprBootDiExApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SprBootDiExApplication.class, args);
		Employee emp = context.getBean(Employee.class);
		emp.testEmp();
	}

}
