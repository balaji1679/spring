package com.conttroller;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		CustomerController obj = new CustomerController();
		Scanner input = new Scanner(System.in);
		System.out.println("----Menu---------");
		System.out.println("1.Add Customer \n2.Update \n3.Delete \n4.Display");
		System.out.println("-----------------");
		System.out.println("Please Enter your choice");
		int choice = input.nextInt();
		if(choice==1) {
		obj.addCustomer();
		}else if(choice==2) {
			obj.updateCustomer();
		}else if(choice==3) {
			obj.deleteCustomer();
		}else if(choice==4) {
			obj.getCustomer();
		}

	}

}
