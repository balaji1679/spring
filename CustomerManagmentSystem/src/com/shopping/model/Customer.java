package com.shopping.model;

public class Customer {
	private int cust_id;
	private String cust_name;
	private int cust_number;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cust_id, String cust_name, int cust_number) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_number = cust_number;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCust_number() {
		return cust_number;
	}
	public void setCust_number(int cust_number) {
		this.cust_number = cust_number;
	}

}
