package com.shopping.SpringORMDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shopping.SpringORMDemo.shop.Shopping;
import com.shopping.SpringORMDemo.shop.ShoppingImpl;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Shopping buy = context.getBean("buyProduct",Shopping.class);
       buy.buyProduct(101);
    }
}
