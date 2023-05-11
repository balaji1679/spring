package com.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
 @RequestMapping("/emp")
	public void getinfo(){
		System.out.println("this is virat");
	}
}
