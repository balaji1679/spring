package com.asi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/asi/refconfig.xml");
		Stud stu = (Stud) context.getBean("per");
		stu.perce();
		

	}

}
