package com.customer.dao;

import java.util.List;

import com.shopping.model.Customer;

public interface CustomerDao {
	public void insertCustomer();
	public void deleteCustomer();
	public void updateCustomer();
	public List<Customer> getCustomers();

}
