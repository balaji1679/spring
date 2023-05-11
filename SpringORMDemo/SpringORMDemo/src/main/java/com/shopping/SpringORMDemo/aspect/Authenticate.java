package com.shopping.SpringORMDemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Authenticate {
	@Before("execution(* com.shopping.SpringORMDemo.shop.ShoppingImpl.*)")
	public void displayDiscountOffer() {
		System.out.println("You have discount of 15% as you are prime user");
		System.out.println("Enjoy your shopping");
	}
	@After("execution(* com.shopping.SpringORMDemo.shop.ShoppingImpl.*)")
	public void displayMessage() {
		System.out.println("Thanks for Shopping");
	}
}
