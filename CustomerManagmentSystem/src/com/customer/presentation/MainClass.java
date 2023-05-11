package com.customer.presentation;

import com.customer.dao.CustomerDaoImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	CustomerDaoImpl obj = new CustomerDaoImpl();
	//	obj.insertCustomer();
		
	//	CustomerDaoImpl obj = new CustomerDaoImpl();
	//	obj.deleteCustomer();
		
		CustomerDaoImpl obj = new CustomerDaoImpl();
		obj.updateCustomer();

	}

}
