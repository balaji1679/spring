package com.customer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shopping.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	Scanner input = new Scanner(System.in);
	Customer cust = new Customer();
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 con =DriverManager.getConnection("jdbc:sqlserver://IMCVBCP110-BLL\\SQLEXPRESS2019;databaseName=Script;user=sa;password=Password_123");
			System.out.println("connected");

		} catch (ClassNotFoundException | SQLException e) {
		
		}
		return con;
	}

	@Override
	public void insertCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name of Customer");
		String cust_name = input.next();
		System.out.println("Enter the Number of Customer");
		int cust_number=input.nextInt();
		cust.setCust_name(cust_name);
		cust.setCust_number(cust_number);
		Connection con= getConnection();
		try {
		PreparedStatement stmt = con.prepareStatement("insert into Customer values(?,?)");
		stmt.setString(1, cust.getCust_name());
		stmt.setFloat(2, cust.getCust_number());
		stmt.executeUpdate();
		System.out.println("Customer Inserted");
		con.close();
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter the ID of Customer");
		int cust_id = input.nextInt();
		cust.setCust_id(cust_id);
		Connection con= getConnection();
		try {
		PreparedStatement stmt = con.prepareStatement("delete from Customer where prod_id=?");
		stmt.setInt(1, cust.getCust_id());
		stmt.executeUpdate();
		System.out.println("Customer Deleted");
		con.close();
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter the ID of Customer");
		int cust_id = input.nextInt();
		System.out.println("Enter the number of Customer");
		int cust_number=input.nextInt();
		cust.setCust_id(cust_id);
		cust.setCust_number(cust_number);
		Connection con= getConnection();
		try {
		PreparedStatement stmt = con.prepareStatement("update Customer set cust_number=? where cust_id=?");
		stmt.setInt(1, cust.getCust_number());
		stmt.setInt(2, cust.getCust_id());
		stmt.executeUpdate();
		System.out.println("Customer Updated");
		con.close();
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		List<Customer> list =new ArrayList();
		Connection con= getConnection();
		try {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Customer");
		while(rs.next()) {
		cust = new Customer(rs.getInt(1),rs.getString(2),rs.getInt(3));
		list.add(cust);
		}
		con.close();

		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		return list;
		
	}

}
