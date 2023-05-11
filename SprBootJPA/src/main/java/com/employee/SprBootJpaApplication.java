package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.employee.dao.EmployeeRepo;

@SpringBootApplication
public class SprBootJpaApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(SprBootJpaApplication.class, args);
	EmployeeRepo emprep = context.getBean(EmployeeRepo.class);
	}

}
