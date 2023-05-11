package com.conttroller;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dao.CustomerDao;

import com.model.Customer;

public class CustomerController {
	static Configuration conf = CustomerDao.getCustomConfig();
	// creating persistent object for persistent class
	static Customer obj = new Customer();

	public static void addCustomer() {
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Scanner input = new Scanner(System.in);
		Transaction tran = session.beginTransaction();
		System.out.println("Enter the Name of Customer");
		String cust_name = input.next();
		System.out.println("Enter the Gender of Customer");
		String cust_gender = input.next();
		System.out.println("Enter the age of Customer");
		int cust_age = input.nextInt();
		System.out.println("Enter the Address of Customer");
		String cust_address = input.next();
		System.out.println("Enter the phone of Customer");
		int cust_phone = input.nextInt();
		System.out.println("Enter the email of Customer");
		String cust_email = input.next();
		obj.setCust_name(cust_name);
		obj.setCust_gender(cust_gender);
		obj.setCust_age(cust_age);
		obj.setCust_address(cust_address);
		obj.setCust_phone(cust_phone);
		obj.setCust_email(cust_email);
		session.save(obj);
		tran.commit();
		session.close();
		System.out.println("Customer Added Successfully");
	}

	public static void updateCustomer() {
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Scanner input = new Scanner(System.in);
		Transaction tran = session.beginTransaction();
		// query interface object creation for updating data
		// need to execute query to update
		// Query interface object will help to execute query using createQuery() method;
		// update CustomerDetails set cust_name=-- where cust_id=--
		Query qr = session.createQuery("update Customer set cust_name=:n where cust_id=:i");
		System.out.println("Enter the ID of Customer");
		int cust_id = input.nextInt();
		System.out.println("Enter the Name of Customer");
		String cust_name = input.next();
		qr.setParameter("n", cust_name);
		qr.setParameter("i", cust_id);
		int row = qr.executeUpdate();
		System.out.println(row + " Rows Updated");
		tran.commit();

	}

	public static void deleteCustomer() {
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Scanner input = new Scanner(System.in);
		Transaction tran = session.beginTransaction();
		// query interface object creation for updating data
		// need to execute query to update
		// Query interface object will help to execute query using createQuery() method;
		// update CustomerDetails set cust_name=-- where cust_id=--
		Query qr = session.createQuery("delete from Customer where cust_id=:i");
		System.out.println("Enter the ID of Customer");
		int cust_id = input.nextInt();
		qr.setParameter("i", cust_id);
		int row = qr.executeUpdate();
		System.out.println(row + " Rows Deleted");
		tran.commit();
	}

	public static void getCustomer() {
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qr = session.createQuery("from Customer"); 
		List<Customer> customers = qr.getResultList();
		Iterator<Customer> itr = customers.iterator();
		while(itr.hasNext()) {
			Customer cust = itr.next();
			System.out.println("Customer ID="+cust.getCust_id()
			+"Customer Name = "+cust.getCust_name()+"Customer age="+cust.getCust_age()+"Customer gender="+cust.getCust_gender()+
			" Customer Address ="+cust.getCust_address()+"Customer phone="+cust.getCust_phone()+"Customer email="+cust.getCust_email());
		}
		
	}

}
