package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/config.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.displayMessage();

	}
}
